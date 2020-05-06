package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class UniqueCharacters {

    StringDemo stringDemo = new StringDemo();
    String s = "tool";
    String u = "john";

    @Test
    public void test() {

        Assert.assertTrue(stringDemo.allUniqueCharacters(u));
        Assert.assertFalse(stringDemo.allUniqueCharacters(s));
    }
}
