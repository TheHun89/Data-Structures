package com.example.datastructures;

// https://www.geeksforgeeks.org/sorting-algorithms/
public class Sorting {

    // https://www.geeksforgeeks.org/bubble-sort/
    public void bubbleSort( int[] array ) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int k = 0; k < array.length - i - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    // https://www.geeksforgeeks.org/insertion-sort/
    public void insertionSort( int[] array ) {
        for (int j = 0; j < array.length - 1; j++)
        {
            for (int i = j + 1; i > 0; i--)
            {
                if (array[i] < array[i - 1])
                {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
    }

    // repeatedly finds min element from unsorted part and puts it at beginning
    // https://www.geeksforgeeks.org/selection-sort/
    public void selectionSort( int[] a ) {
        ArrayDemo.printArray(a);
        for (int j = 0; j < a.length - 1; j++) {
            int minVal = j;

            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[minVal]) {
                    minVal = i;
                }
            }

            if (minVal != j) {
                int temp = a[minVal];
                a[minVal] = a[j];
                a[j] = temp;
            }
        }
        ArrayDemo.printArray(a);
    }

    public void quickSort() {

    }

    public void mergeSort() {

    }

    public void heapSort() {

    }
}
