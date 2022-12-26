package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BinarySearch bsIterative = new BinarySearch();
        BinarySearch bsRecursive = new BinarySearch();
        ArrayList<Integer> arrIterative = new ArrayList<Integer>();
        arrIterative.add(1);
        arrIterative.add(7);
        arrIterative.add(5);
        arrIterative.add(2);
        arrIterative.add(11);
        arrIterative.add(3);

        int searchElement = 5;


        System.out.println(bsIterative.binarySearchIterative(arrIterative, searchElement));
        System.out.println(arrIterative);
        System.out.println(searchElement);



        ArrayList<Integer> arrRecursive = new ArrayList<Integer>();
        arrRecursive.add(6);
        arrRecursive.add(7);
        arrRecursive.add(5);
        arrRecursive.add(9);
        arrRecursive.add(11);
        arrRecursive.add(1);

        int searchEl = 5;
        int low = 0;
        int high = arrRecursive.size();

        System.out.println(bsRecursive.binarySearchRecursive(arrRecursive, searchEl, low, high));
        System.out.println(arrRecursive);
        System.out.println(searchEl);


    }
}
