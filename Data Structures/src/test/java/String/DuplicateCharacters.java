package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class DuplicateCharacters {

    String example = "Example String";
    StringDemo stringDemo = new StringDemo();

    @Test
    public void test() {

        System.out.println(example + " has duplicates:" + stringDemo.duplicateCharacters(example));

        Assert.assertTrue((stringDemo.duplicateCharacters(example)).toString().equals("e"));
    }
}
