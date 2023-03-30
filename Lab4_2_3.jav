import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Brak argumentów programu.");
            System.out.println("Użycie: java FileCopy source_file target");
            return;
        }

        String sourceFile = args[0];
        String targetFile = args[1];

        File source = new File(sourceFile);
        File target = new File(targetFile);

        if (!source.exists()) {
            System.out.println("Plik " + sourceFile + " nie istnieje.");
            return;
        }

        if (source.isDirectory()) {
            System.out.println(sourceFile + " jest katalogiem.");
            return;
        }

        if (!source.canRead()) {
            System.out.println("Brak dostępu do pliku " + sourceFile);
            return;
        }

        if (target.isDirectory()) {
            target = new File(targetFile, source.getName());
        }

        if (target.exists() && !target.canWrite()) {
            System.out.println("Brak wymaganych uprawnień do zapisu pliku " + target.getName());
            return;
        }

        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

        } catch (IOException e) {
            System.out.println("Nie można skopiować pliku: " + e.getMessage());
            return;
        }

        System.out.println("Plik " + sourceFile + " został skopiowany do " + targetFile);
    }
}
