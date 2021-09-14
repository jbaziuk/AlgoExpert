package AlgoExpertTests.Easy;

import AlgoExpert.Easy.FindThreeLargestNumbers;
import AlgoExpert.Easy.SortedSquaredArray;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SortedQuaredArrayTests {

    @Test
    public void positiveNumbers() {
        int[] array = {1, 2, 3, 5, 6, 8, 9};

        int[] squaredArray = SortedSquaredArray.sortedSquaredArray(array);

        Assert.assertEquals(new int[]{1, 4, 9, 25, 36, 64, 81}, squaredArray);
    }

    @Test
    public void handleNegativeNumbers() {
        int[] array = {-2, -1};

        int[] squaredArray = SortedSquaredArray.sortedSquaredArray(array);

        Assert.assertEquals(new int[]{1, 4}, squaredArray);
    }



}
