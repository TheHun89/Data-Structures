package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class Reverse {

    String example = "Example String";
    StringDemo stringDemo = new StringDemo();

    @Test
    public void reverseIterative() {

        System.out.println("original string: " + example);
        String newString = stringDemo.reverseStringIteration(example);
        System.out.println("new iterative string: " + newString);

        Assert.assertTrue(newString.equals("gnirtS elpmaxE"));
    }

    @Test
    public void reverseRecursive() {

        System.out.println("original string: " + example);
        String newString = stringDemo.reverseStringRecursion(example);
        System.out.println("new recursive string: " + newString);

        Assert.assertTrue(newString.equals("gnirtS elpmaxE"));
    }
}
