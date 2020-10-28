package AlgoExpertEasyTests;

import Easy.BubbleSort;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTests {

    @Test
    public void bubbleSortTest() {
        int[] unsortedArray = {33, 21, 73, 45, 1, 61, 0, 72, 71, 45};
        int[] sortedArray = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(sortedArray, BubbleSort.bubbleSort(unsortedArray));
    }

    @Test
    public void smallSortTest() {
        int[] unsortedArray = {4, 1, 3, 0, 2};
        int[] sortedArray = {0, 1, 2, 3, 4};
        Assert.assertEquals(sortedArray, BubbleSort.bubbleSort(unsortedArray));
    }

    @Test
    public void arrayIsNullTest() {
        int[] unsortedArray = null;
        Assert.assertEquals(new int[]{}, BubbleSort.bubbleSort(unsortedArray));
    }

    @Test
    public void arrayIsEmptyTest() {
        int[] unsortedArray = new int[]{};
        Assert.assertEquals(new int[]{}, BubbleSort.bubbleSort(unsortedArray));
    }

}
