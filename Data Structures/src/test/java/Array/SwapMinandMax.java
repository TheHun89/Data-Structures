package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SwapMinandMax {

    ArrayDemo arrayDemo = new ArrayDemo();
    int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};

    @Test
    public void test() {

        System.out.println("array before min and max swap:");
        arrayDemo.printArray(intArray1);
        arrayDemo.swapMinAndMax(intArray1);
        System.out.println("array after min and max swap:");
        arrayDemo.printArray(intArray1);

        Assert.assertTrue(Arrays.equals(intArray1, new int[]{2, 5, 1, 2, 2, 7, 5}));
    }
}
