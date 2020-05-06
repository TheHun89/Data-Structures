package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicates {

    String s = "duplicatestring";
    StringDemo stringDemo = new StringDemo();

    @Test
    public void test() {

        System.out.println("string before removing duplicates - " + s);
        System.out.println(stringDemo.removeDuplicates(s));
        Assert.assertTrue(stringDemo.removeDuplicates(s).toString().equals("duplicatesrng"));
    }
}
