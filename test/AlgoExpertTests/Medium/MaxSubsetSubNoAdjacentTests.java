package AlgoExpertTests.Medium;

import AlgoExpert.Medium.MaxSubsetSumNoAdjacent;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MaxSubsetSubNoAdjacentTests {

    @Test
    public void maxSumUsingRobMethod() {
        int[] array = {75, 105, 120, 75, 90, 135};
        int[] memo = new int[100];
        Arrays.fill(memo, -1);
        MaxSubsetSumNoAdjacent sum = new MaxSubsetSumNoAdjacent();
        int result = sum.rob(array, memo);
        Assert.assertEquals(result, 330);
    }

    @Test
    public void maxSum() {
        int[] array = {75, 105, 120, 75, 90, 135};
        MaxSubsetSumNoAdjacent sum = new MaxSubsetSumNoAdjacent();
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(array);
        Assert.assertEquals(result, 330);
    }

    @Test
    public void simpleMaxSum() {
        int[] array = {12, 10, 5, 7};
        MaxSubsetSumNoAdjacent sum = new MaxSubsetSumNoAdjacent();
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(array);
        Assert.assertEquals(result, 19);
    }

}
