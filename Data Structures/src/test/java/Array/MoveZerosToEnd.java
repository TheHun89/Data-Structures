package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveZerosToEnd {

    @Test
    public void moveZerosToEnd() {

        ArrayDemo arrayDemo = new ArrayDemo();
        int[] intArrayZeros = { 0, 1, 0, 3, 12};

        System.out.println("array before moving zeros to end:");
        arrayDemo.printArray(intArrayZeros);
        arrayDemo.moveZerosToEnd(intArrayZeros);
        System.out.println("array after moving zeros to end:");
        arrayDemo.printArray(intArrayZeros);

        Assert.assertTrue(Arrays.equals(new int[]{ 1, 3, 12, 0, 0}, intArrayZeros));
        Assert.assertFalse(Arrays.equals(new int[]{ 0, 1, 0, 3, 12}, intArrayZeros));
    }
}
