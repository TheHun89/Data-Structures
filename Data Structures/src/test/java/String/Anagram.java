package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class Anagram {

    @Test
    public void isAnagram() {

        String anagram1 = "iceman";
        String anagram2 = "cinema";

        StringDemo stringDemo = new StringDemo();

        System.out.println("original strings: " + anagram1 + " and " + anagram2);
        Assert.assertTrue(stringDemo.isAnagram(anagram1, anagram2));


    }
}
