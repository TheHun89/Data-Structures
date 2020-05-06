package Sort;

import com.example.datastructures.ArrayDemo;
import com.example.datastructures.Sorting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Bubble {

    int[] bubble = {5, 4, 3, 2, 1};
    Sorting sorting = new Sorting();

    @Test
    public void test() {

        ArrayDemo.printArray(bubble);
        sorting.bubbleSort(bubble);
        System.out.println();
        ArrayDemo.printArray(bubble);
        Assert.assertTrue(Arrays.equals(bubble, new int[]{1, 2, 3, 4, 5}));
    }
}
