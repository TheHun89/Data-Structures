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

    // https://www.baeldung.com/java-quicksort
    public static void quickSort(int arr[], int begin, int end)
    {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            // Recursively sort elements of the 2 sub-arrays
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int arr[], int begin, int end)
    {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j=begin; j<end; j++)
        {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }

    public void heapSort() {

    }

    public static void shellSort(int arrayToSort[]) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
}
