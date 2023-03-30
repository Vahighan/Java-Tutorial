import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Brak argumentów programu.");
            return;
        }

        boolean countLines = false;
        boolean countWords = false;
        boolean countChars = false;
        String fileName = "";

        // Sprawdzanie opcji
        for (String arg : args) {
            if (arg.startsWith("-")) {
                if (arg.contains("l")) {
                    countLines = true;
                }
                if (arg.contains("w")) {
                    countWords = true;
                }
                if (arg.contains("c")) {
                    countChars = true;
                }
            } else {
                fileName = arg;
            }
        }

        if (!countLines && !countWords && !countChars) {
            System.out.println("Brak opcji programu.");
            return;
        }

        // Liczenie linii, słów i znaków
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lines = 0;
            int words = 0;
            int chars = 0;
            while ((line = reader.readLine()) != null) {
                lines++;
                chars += line.length();
                String[] lineWords = line.split("\\s+");
                words += lineWords.length;
            }
            if (countLines) {
                System.out.println("wierszy: " + lines);
            }
            if (countWords) {
                System.out.println("słów: " + words);
            }
            if (countChars) {
                System.out.println("znaków: " + chars);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik " + fileName + " nie istnieje.");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku " + fileName + ".");
        }
    }
}
