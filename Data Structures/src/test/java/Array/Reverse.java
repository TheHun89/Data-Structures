package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Reverse {

    @Test
    public void reverse() {

        ArrayDemo arrayDemo = new ArrayDemo();
        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};

        System.out.println("before reverse:");
        arrayDemo.printArray(intArray1);
        arrayDemo.reverse(intArray1);

        System.out.println();
        System.out.println("after reverse:");
        arrayDemo.printArray(intArray1);

        Assert.assertTrue(Arrays.equals(new int[]{5, 1, 2, 2, 7, 5, 2}, intArray1));
        Assert.assertFalse(Arrays.equals(new int[]{2, 5, 7, 2, 2, 1, 5}, intArray1));
    }
}
