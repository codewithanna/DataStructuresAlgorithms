package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import main.BubbleSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private static BubbleSort bubbleSortInstance;


    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        bubbleSortInstance = new BubbleSort();
    }


    @Test
    void testFiveElementsArray() {
        int[] fiveElementsArray = {90, 7, 100, 5, 45};
        int[] expected = {5, 7, 45, 90, 100};
        int[] result = bubbleSortInstance.bubbleSort(fiveElementsArray);

        // expected == result will not work because expected and result rerefence different objects, they will not be equal even if the contents are the same
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testFifteenElementsArray() {
        int[] fifteenElementsArray = {4, 6, 1, 65, 87, 23, 56, 66, 14, 0, 9, 34, 43, 90, 123};
        int[] expected = {0, 1, 4, 6, 9, 14, 23, 34, 43, 56, 65, 66, 87, 90, 123};
        int[] result = bubbleSortInstance.bubbleSort(fifteenElementsArray);

        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    void testDuplicateValueArray() {
        int[] duplicateValueArray = {1, 4, 4, 5, 4};
        int[] expected = {1, 4, 4, 4, 5};
        int[] result = bubbleSortInstance.bubbleSort(duplicateValueArray);

        assertTrue(Arrays.equals(expected, result));
    }

}