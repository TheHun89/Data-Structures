package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Sort {

    @Test
    public void testAscSort() {

        ArrayDemo arrayDemo = new ArrayDemo();
        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};

        System.out.println("Before sort:");
        arrayDemo.printArray(intArray1);


        System.out.println();
        System.out.println("Asc order:");


        Assert.assertTrue(Arrays.equals(new int[]{1, 2, 2, 2, 5, 5, 7}, arrayDemo.sort(intArray1, "asc")));
        Assert.assertFalse(Arrays.equals(new int[]{2, 5, 7, 2, 2, 1, 5}, arrayDemo.sort(intArray1, "asc")));
        arrayDemo.printArray(intArray1);
        System.out.println();
    }

    @Test
    public void testDescSort() {

        ArrayDemo arrayDemo = new ArrayDemo();
        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};

        System.out.println("Before sort:");
        arrayDemo.printArray(intArray1);


        System.out.println();
        System.out.println("Desc order:");


        Assert.assertTrue(Arrays.equals(new int[]{7, 5, 5, 2, 2, 2, 1}, arrayDemo.sort(intArray1, "desc")));
        Assert.assertFalse(Arrays.equals(new int[]{2, 5, 7, 2, 2, 1, 5}, arrayDemo.sort(intArray1, "desc")));
        arrayDemo.printArray(intArray1);
        System.out.println();
    }
}
