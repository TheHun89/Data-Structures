package String;

import com.example.datastructures.StringDemo;
import org.junit.Assert;
import org.junit.Test;

public class Palindrome {

    String palindrome = "Do Geese See God";
    StringDemo stringDemo = new StringDemo();

    @Test
    public void testIterative() {

        System.out.println(palindrome + " is a palindrome.");
        Assert.assertTrue(stringDemo.isPalindrome(palindrome));
    }

    @Test
    public void testRecursive() {

    }
}
