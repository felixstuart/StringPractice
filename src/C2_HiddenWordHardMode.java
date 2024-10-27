import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * Problem: You are given a long string containing multiple hidden words.
 * Write a function that finds and prints
 * the word hidden between two markers ("*" and "~").
 * Identify the song hidden in the text!
 */


public class C2_HiddenWordHardMode {

    public static void main(String[] args) {
        C2_HiddenWordHardMode c = new C2_HiddenWordHardMode();
    }

    public C2_HiddenWordHardMode() {
        findHiddenLyrics("hidden_lyrics.txt");
    }

    public void findHiddenLyrics(String fileName) {

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                /* TODO: your code goes here */
                Pattern pattern = Pattern.compile("\\*.+~");
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()) {
                    System.out.println(matcher.group().substring(1, matcher.group().length()-1));
                }
            }
            scanner.close();
            System.out.println("The song is AMERIICAN REQUIEM by Beyoncé");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
