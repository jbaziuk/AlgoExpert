package AlgoExpertTests.Easy;

import AlgoExpert.Easy.BinarySearch;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BinarySearchTests {

    @Test
    public void canBeFound() {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(3, BinarySearch.binarySearch(array, 33));
    }

    @Test
    public void notFoundGreater() {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, 99));
    }

    @Test
    public void notFoundLesser() {
        int[] array = {10, 13, 21, 33, 45, 45, 61, 71, 72, 73};
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }

    @Test
    public void arrayNullTest() {
        Assert.assertEquals(-1, BinarySearch.binarySearch(null, 4));
    }

    @Test
    public void arrayEmptyTest() {
        int[] array = new int[]{};
        Assert.assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }


}
