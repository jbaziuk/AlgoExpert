package AlgoExpertTests.Easy;

import AlgoExpert.Easy.TwoNumberSum;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TwoNumberSumTests {

    @Test
    public void defaultPairFound() {
        int[] results = TwoNumberSum.twoNumberSum(TwoNumberSum.array, TwoNumberSum.targetSum);
        Assert.assertEquals(results[0], -1);
        Assert.assertEquals(results[1], 11);
    }

    @Test
    public void pairNotFound() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 27;
        int[] results = TwoNumberSum.twoNumberSum(array, targetSum);
        Assert.assertEquals(results, new int[0]);
    }

    @Test
    public void manyPairsFound() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 5, 6, 2, 9, 11};
        ArrayList<int[]> results = TwoNumberSum.returnAllPairsForTwoNumberSum(array, TwoNumberSum.targetSum);
        Assert.assertEquals(results.size(), 4);
    }


}
