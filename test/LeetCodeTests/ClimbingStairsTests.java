package LeetCodeTests;

import LeetCode.Easy.ClimbingStairs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClimbingStairsTests {

    @Test
    public void ZeroStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(0);
        Assert.assertEquals(results, 0);
    }

    @Test
    public void OneStepTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(1);
        Assert.assertEquals(results, 1);
    }

    @Test
    public void fiveStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(5);
        Assert.assertEquals(results,8);
    }

    @Test
    public void sixStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(6);
        Assert.assertEquals(results,13);
    }

    @Test
    public void thirteenStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(13);
        Assert.assertEquals(results,377);
    }

    @Test
    public void fortyFiveStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(45);
        Assert.assertEquals(results,1836311903);
    }

}
