package org.example;

public class LinearSearch {

    public int linearSearch(int[] arr, int number) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
