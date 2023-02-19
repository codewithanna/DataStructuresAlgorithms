package main;

public class QuickSort {

    public int partition(int[] arr, int low, int high){

    int pivot = arr[low];
    int i = low;
    int j = high;

    // move the pointers
    while (i < j) {

        while(i < arr.length && arr[i] <= pivot) {i++;}
        while(j >= 0 && arr[j] > pivot) {j--;}

        if (i < j ) {
            //swapping i and j
            swap(arr, i, j);
        }
    }

    // once i is no longer smaller than j, it is time to swap pivot with j
    swap(arr, low, j);

    // return partition position
    return j;

    }

    public void swap(int[] arr, int i, int j) {

        int iValue = arr[i];
        arr[i] = arr[j];
        arr[j] = iValue;
    }

    public int[] quickSort(int[] arr, int low, int high) {

        if(low < high) {
            int partition = partition(arr, low, high);

            // quick sort on the left side of the partition
            quickSort(arr, low, partition-1);

            // quick sort on the right side of the partition
            quickSort(arr, partition+1, high);
        }
        return arr;
    }
}
