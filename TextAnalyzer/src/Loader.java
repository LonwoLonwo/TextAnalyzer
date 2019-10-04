import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Loader
{
    public static void main(String[] args) throws Exception
    {
        try {
            //Reading file to the String
            String text = new String(Files.readAllBytes(Paths.get("G:\\Java Projects\\TextAnalyzer\\TextAnalyzer\\res\\text_01.txt")));

            TextAnalyzer analyzer = new TextAnalyzer(text);
            System.out.println("Most frequent word: " + analyzer.getMostFrequentWord());
        } catch (IOException e) {
            System.out.println("Where is my File?");
        }
    }


}