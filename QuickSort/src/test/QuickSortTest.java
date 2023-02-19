package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.QuickSort;

class QuickSortTest {



    private static QuickSort quickSortInstance;


    @BeforeAll
    static void setUpBeforeClass() {
        quickSortInstance = new QuickSort();
    }


    @Test
    void testFiveElementsArray() {
        int[] fiveElementsArray = {90, 7, 100, 5, 45};
        int leftIndex = 0;
        int rightIndex = fiveElementsArray.length-1;
        int[] expected = {5, 7, 45, 90, 100};
        int[] result = quickSortInstance.quickSort(fiveElementsArray, leftIndex, rightIndex);

        // expected == result will not work because expected and result rerefence different objects, they will not be equal even if the contents are the same
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testFifteenElementsArray() {
        int[] fifteenElementsArray = {4, 6, 1, 65, 87, 23, 56, 66, 14, 0, 9, 34, 43, 90, 123};
        int leftIndex = 0;
        int rightIndex = fifteenElementsArray.length-1;
        int[] expected = {0, 1, 4, 6, 9, 14, 23, 34, 43, 56, 65, 66, 87, 90, 123};
        int[] result = quickSortInstance.quickSort(fifteenElementsArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testDuplicateValueArray() {
        int[] duplicateValueArray = {1, 4, 4, 5, 4};
        int leftIndex = 0;
        int rightIndex = duplicateValueArray.length-1;
        int[] expected = {1, 4, 4, 4, 5};
        int[] result = quickSortInstance.quickSort(duplicateValueArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testManyDuplicateValuesArray() {
        int[] duplicateValueArray = {1, 4, 4, 4, 4, 4, 4, 4, 1};
        int leftIndex = 0;
        int rightIndex = duplicateValueArray.length-1;
        int[] expected = {1, 1, 4, 4, 4, 4, 4, 4, 4 };
        int[] result = quickSortInstance.quickSort(duplicateValueArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testSameValue() {
        int[] duplicateValueArray = {4, 4, 4, 4, 4, 4, 4, 4, 4};
        int leftIndex = 0;
        int rightIndex = duplicateValueArray.length-1;
        int[] expected = {4, 4, 4, 4, 4, 4, 4, 4, 4 };
        int[] result = quickSortInstance.quickSort(duplicateValueArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testOneElement() {
        int[] duplicateValueArray = {4};
        int leftIndex = 0;
        int rightIndex = duplicateValueArray.length-1;
        int[] expected = {4};
        int[] result = quickSortInstance.quickSort(duplicateValueArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testEmptyArray() {
        int[] duplicateValueArray = {};
        int leftIndex = 0;
        int rightIndex = duplicateValueArray.length-1;
        int[] expected = {};
        int[] result = quickSortInstance.quickSort(duplicateValueArray, leftIndex, rightIndex);

        assertTrue(Arrays.equals(expected, result));
    }


}