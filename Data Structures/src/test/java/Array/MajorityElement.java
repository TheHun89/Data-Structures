package Array;

import com.example.datastructures.ArrayDemo;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    @Test
    public void test() {

        int[] intArray1 = {2, 5, 7, 2, 2, 1, 5};
        ArrayDemo arrayDemo = new ArrayDemo();


        HashMap hashMap = arrayDemo.getMajorityElement( intArray1);
        System.out.println(hashMap);
        System.out.println(Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
