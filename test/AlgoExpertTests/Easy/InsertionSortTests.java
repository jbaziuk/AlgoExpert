package AlgoExpertTests.Easy;

import AlgoExpert.Easy.InsertionSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertionSortTests {

    @Test
    public void insertionSortTest() {
        Integer[] integerARR = null;
        int[] intARR = null;

        int[] unsortedArray = {33, 21, 73, 45, 1, 61, 0, 72, 71, 45};
        int[] sortedArray = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(sortedArray, InsertionSort.insertionSort(unsortedArray));
    }

    @Test
    public void smallSortTest() {
        int[] unsortedArray = {4, 1, 3, 0, 2};
        int[] sortedArray = {0, 1, 2, 3, 4};
        Assert.assertEquals(sortedArray, InsertionSort.insertionSort(unsortedArray));
    }

    @Test
    public void arrayIsNullTest() {
        int[] unsortedArray = null;
        int[] sortedArray = {};
        Assert.assertEquals(sortedArray, InsertionSort.insertionSort(unsortedArray));
    }

}
