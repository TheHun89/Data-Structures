package Sort;

import com.example.datastructures.ArrayDemo;
import com.example.datastructures.Sorting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Insertion {

    Sorting sorting = new Sorting();
    int[] insert = {5, 4, 3, 2, 1};


    @Test
    public void test() {

        ArrayDemo.printArray(insert);
        sorting.insertionSort(insert);
        System.out.println();
        ArrayDemo.printArray(insert);
        Assert.assertTrue(Arrays.equals(insert, new int[]{1, 2, 3, 4, 5}));
    }
}
