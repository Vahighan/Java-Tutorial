package <project_name>;
import java.io.*;
import java.net.*;

public class FileAndURLCopy {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Brak argumentów programu.");
            System.out.println("Użycie: java FileAndURLCopy source_file_or_url target");
            return;
        }

        String source = args[0];
        String target = args[1];

        try {
            URL url = new URL(source);
            copyURL(url, target);
        } catch (MalformedURLException e) {
            // argument nie jest URL'em, traktujemy jako nazwę pliku
            File file = new File(source);
            copyFile(file, target);
        }
    }

    private static void copyFile(File source, String target) {
        if (!source.exists()) {
            System.out.println("Plik " + source.getName() + " nie istnieje.");
            return;
        }
        if (source.isDirectory()) {
            System.out.println(source.getName() + " jest katalogiem.");
            return;
        }
        if (!source.canRead()) {
            System.out.println("Brak dostępu do pliku " + source.getName());
            return;
        }

        File targetFile = new File(target);
        if (targetFile.isDirectory()) {
            targetFile = new File(target, source.getName());
        }

        if (targetFile.exists() && !targetFile.canWrite()) {
            System.out.println("Brak wymaganych uprawnień do zapisu pliku " + targetFile.getName());
            return;
        }

        try {
            FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Nie można skopiować pliku " + source.getName() + " do " + targetFile.getName());
        }
    }

    private static void copyURL(URL source, String target) {
        if (!isNetworkAvailable()) {
            System.out.println("Brak połączenia sieciowego.");
            return;
        }

        
        File targetFile = new File(target);
        if (targetFile.isDirectory()) {
           
        }

        try {
            HttpURLConnection conn = (HttpURLConnection) source.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                System.out.println("Brak dostępu do " + source);
                return;
            }

            InputStream in = conn.getInputStream();
            FileOutputStream out = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Nie można skopiować " + source + " do " + targetFile.getName());
        }
    }
}
