package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class WordCount {

    StringDemo stringDemo = new StringDemo();
    String example = "Example String";

    @Test
    public void test() {

        System.out.println(example + " has " + stringDemo.numberOfWords(example) + " words.");
        Assert.assertEquals(2, stringDemo.numberOfWords(example));
    }
}
