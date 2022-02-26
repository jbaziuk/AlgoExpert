package LeetCodeTests.Easy;

import LeetCode.Easy.TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTests {

    @Test
    public void defaultPairFound() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] results = TwoSum.twoSum(array, targetSum);
        Assert.assertEquals(new int[]{6,4}, results);
    }

}
