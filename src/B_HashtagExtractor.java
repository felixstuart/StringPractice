/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        Pattern hashtag = Pattern.compile("#\\w+");
        Matcher matcher = hashtag.matcher(post);
        while(matcher.find()) {
            System.out.print("Hashtag: "+matcher.group()+", ");
        }
    }
}
