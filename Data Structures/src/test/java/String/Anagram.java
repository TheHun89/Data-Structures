package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class Anagram {

    @Test
    public void isAnagramSorting() {

        String anagram1 = "iceman";
        String anagram2 = "cinema";

        StringDemo stringDemo = new StringDemo();

        System.out.println("original strings: " + anagram1 + " and " + anagram2);
        Assert.assertTrue(stringDemo.isAnagramSorting(anagram1, anagram2));
    }

    @Test
    public void givenAnagram_whenUsingCounting_thenIdentifyAnagram() {

        StringDemo stringDemo = new StringDemo();

        Anagram anagram = new Anagram();
        String string1 = "abcab";
        String string2 = "cabba";
        Assert.assertTrue(stringDemo.isAnagramCounting(string1, string2));
    }
}
