package Sort;

import com.example.datastructures.ArrayDemo;
import com.example.datastructures.Sorting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Selection {

    Sorting sorting = new Sorting();
    int[] selection = {5, 4, 3, 2, 1};

    @Test
    public void test() {

        ArrayDemo.printArray(selection);
        sorting.insertionSort(selection);
        System.out.println();
        ArrayDemo.printArray(selection);
        Assert.assertTrue(Arrays.equals(selection, new int[]{1, 2, 3, 4, 5}));
    }
}
