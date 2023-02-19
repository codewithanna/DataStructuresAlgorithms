package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] arr = {10, 16, 8, 12, 15, 6, 3, 9, 5};
        int low = 0;
        int high = arr.length - 1;

        quickSort.quickSort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }
}