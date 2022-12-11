package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 6, 1, 65, 87, 23, 56, 66, 14, 0, 9, 34, 43, 90, 123};
        int[] arr1 = {4, 6, 1, 65, 87, 23, 56, 66, 14, 0, 9, 34, 43, 90, 123};
        int[] arr2 = {4, 6, 1, 65, 87, 23, 56, 66, 14, 0, 9, 34, 43, 90, 123};

        BubbleSort bubbleSort = new BubbleSort();
        BubbleSortOptFirst bubbleSortOptFirst = new BubbleSortOptFirst();
        BubbleSortOptSecond bubbleSortOptSecond = new BubbleSortOptSecond();

        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSortOptFirst.bubbleSortOptFirst(arr1)));
        System.out.println(Arrays.toString(bubbleSortOptSecond.bubbleSortOptSecond(arr2)));

    }
}