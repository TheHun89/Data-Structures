package Sort;

import com.example.datastructures.Sorting;
import org.junit.Assert;
import org.junit.Test;

public class Quick {

    Sorting sorting = new Sorting();

    @Test
    public void givenIntegerArray_whenSortedWithQuickSort_thenGetSortedArray() {
        int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
        int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        sorting.quickSort(actual, 0, actual.length-1);
        Assert.assertArrayEquals(expected, actual);
    }
}
