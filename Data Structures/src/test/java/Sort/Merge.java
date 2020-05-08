package Sort;

import com.example.datastructures.Sorting;
import org.junit.Assert;
import org.junit.Test;

public class Merge {

    Sorting sorting = new Sorting();

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        sorting.mergeSort(actual, actual.length);
        Assert.assertArrayEquals(expected, actual);
    }
}
