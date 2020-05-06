package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ContainsDuplicates {

    @Test
    public void containsDuplicates() {

        ArrayDemo arrayDemo = new ArrayDemo();
        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};

        Assert.assertTrue(arrayDemo.containsDuplicates(intArray1));
    }
}
