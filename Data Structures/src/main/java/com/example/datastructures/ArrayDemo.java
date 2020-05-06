package com.example.datastructures;

import java.util.*;

public class ArrayDemo {

    // Rotate array to given pivot
    public int[] rotateRight( int pivot, int[] array ) {
//        int[] right = Arrays.copyOfRange( intArray, pivot, intArray.length - 1);
//        int[] left = Arrays.copyOfRange( intArray, 0, pivot);

        int[] temp = new int[array.length];
        int start = 0;

        for (int i = pivot; i < array.length; i++) {
            temp[start] = array[i];
            start++;
        }

        for (int i = 0; i < pivot; i++) {
            temp[start] = array[i];
        }

        return temp;
    }

    // Determine if any two ints sum to given int
    public boolean checkForSum( int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                    return true;
                }
            }
        }
        System.out.println("no 2 ints are a sum of " + sum);
        return false;
    }

    public int[] sort( int[] array, String order ) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (order == "asc") {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
                else // order == "desc"
                {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

    // Time Complexity : O(n)
    public int[] reverse( int[] array ) {
        int start = 0;
        int end = array.length -1;

        while (start < end) {
            int temp = array[start];

            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
        return array;
    }

    public HashMap<Integer, Integer> getMajorityElement(int[] array ) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        int maxVal = 0;
        int highKey = 0;

        for (int i:array) {
            if(hashtable.containsKey(i)) {
                hashtable.put(i, hashtable.get(i) + 1);
            } else {
                hashtable.put(i, 1);
            }
        }

        for(Integer in: hashtable.keySet()){
            if(hashtable.get(in)>maxVal){
                highKey=in;
                maxVal = hashtable.get(in);
            }
        }
        return hashtable;
    }

    public boolean containsDuplicates( int[] array ) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: array) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
                System.out.println(i + " is a duplicate");
                return true;
            } else {
                hashMap.put(i, 1);
            }
        }
        return false;
    }

    public int[] swapMinAndMax( int[] array ) {
        int min = 0;
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            } else if (array[i] > array[max]) {
                max = i;
            }
        }
        System.out.println("max position is " + max + " and the low position is " + min);
        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;
        return array;
    }

    public int[] moveZerosToEnd( int[] array ) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for(int j = i; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] mergeTwoSortedArraysIntoOne( int[] x, int[] y) {
        int[] merged = new int[x.length + y.length];

        for(int i = 0; i < x.length; i++) {
            merged[i] = x[i];
        }

        int yStart = 0;
        for(int j = x.length; j < merged.length; j++) {
            merged[j] = y[yStart];
            yStart++;
        }
        return merged;
    }

    public void processArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        for (int i: list) {
            System.out.println(i);
        }
    }

    public static void printArray( int[] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
