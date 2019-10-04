import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TextAnalyzerTest

{
    @Test
    public void getWordsTest(){
        TextAnalyzer textAnalyzer = new TextAnalyzer("Mama mila, ramu mila! 2 pomila.");
        ArrayList<String> actualWords = textAnalyzer.getWords();

        ArrayList<String> wordsTest = new ArrayList<>();
        wordsTest.add("mama");
        wordsTest.add("mila");
        wordsTest.add("ramu");
        wordsTest.add("mila");
        wordsTest.add("pomila");

        Assert.assertEquals(wordsTest, actualWords);
    }

    @Test
    public void getMostFrequentWordTest()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer("Mama mila, ramu mila! 2 pomila.");
        String actualMostFrequentWord = textAnalyzer.getMostFrequentWord();
        String expectedMostFrequentWord = "mila";

        Assert.assertEquals(actualMostFrequentWord, expectedMostFrequentWord);
    }
}
