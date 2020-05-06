package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

public class CheckForSum {

    @Test
    public void checkForSum() {

        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};
        ArrayDemo arrayDemo = new ArrayDemo();

        Assert.assertTrue(arrayDemo.checkForSum(intArray1, 4));
        Assert.assertFalse(arrayDemo.checkForSum(intArray1, 0));
    }
}
