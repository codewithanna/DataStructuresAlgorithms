import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.example.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    BinarySearch bSearch;
    ArrayList<Integer> listOdd;
    ArrayList<Integer> listEven;


    @BeforeEach
    void setUp() throws Exception {
        bSearch = new BinarySearch();

        listOdd = new ArrayList<Integer>();
        listOdd.add(15);
        listOdd.add(90);
        listOdd.add(40);
        listOdd.add(35);
        listOdd.add(30);
        listOdd.add(150);
        listOdd.add(17);

        listEven = new ArrayList<Integer>();
        listEven.add(15);
        listEven.add(90);
        listEven.add(40);
        listEven.add(35);
        listEven.add(30);
        listEven.add(150);
        listEven.add(17);
        listEven.add(0);
        listEven.add(1);
        listEven.add(2);
    }

    @Test
    void testIterativeOdd() {
        int expected = 2;
        int result = bSearch.binarySearchIterative(listOdd, 30);

        assertEquals(expected, result);

    }

    @Test
    void testIterativeEven() {
        int expected = 8;
        int result = bSearch.binarySearchIterative(listEven, 90);

        assertEquals(expected, result);

    }


    @Test
    void testIterativeMiddle() {
        int expected = 3;
        int result = bSearch.binarySearchIterative(listOdd, 35);

        assertEquals(expected, result);

    }

    @Test
    void testIterativeDoesNotExist() {
        int expected = -1;
        int result = bSearch.binarySearchIterative(listEven, 95);

        assertEquals(expected, result);

    }

    @Test
    void testRecursiveOdd() {
        int expected = 2;
        int high = listOdd.size()-1;
        int result = bSearch.binarySearchRecursive(listOdd, 30, 0, high);

        assertEquals(expected, result);

    }


    @Test
    void testRecursiveEven() {
        int expected = 8;
        int high = listEven.size()-1;
        int result = bSearch.binarySearchRecursive(listEven, 90, 0, high);

        assertEquals(expected, result);

    }


    @Test
    void testRecursiveMiddle() {
        int expected = 3;
        int high = listOdd.size()-1;
        int result = bSearch.binarySearchRecursive(listOdd, 35, 0, high);

        assertEquals(expected, result);

    }


    @Test
    void testRecursiveDoesNotExist() {
        int expected = -1;
        int high = listOdd.size()-1;
        int result = bSearch.binarySearchRecursive(listOdd, 95, 0, high);

        assertEquals(expected, result);

    }

}