package AlgoExpertEasyTests;

import Easy.SelectionSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectionSortTests {

    @Test
    public void insertionSortTest() {
        int[] unsortedArray = {33, 21, 73, 45, 1, 61, 0, 72, 71, 45};
        int[] sortedArray = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(sortedArray, SelectionSort.selectionSort(unsortedArray));
    }

    @Test
    public void smallSortTest() {
        int[] unsortedArray = {4, 1, 3, 0, 2};
        int[] sortedArray = {0, 1, 2, 3, 4};
        Assert.assertEquals(sortedArray, SelectionSort.selectionSort(unsortedArray));
    }

}
