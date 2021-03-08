package LeetCodeTests;

import LeetCode.Easy.ClimbingStairs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClimbingStairsTests {

    @Test
    public void OneOrTwoStepsToZeroStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(0);
        Assert.assertEquals(results, 0);
    }

    @Test
    public void OneOrTwoStepsToOneStepTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(1);
        Assert.assertEquals(results, 1);
    }

    @Test
    public void OneOrTwoStepsToFiveStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(5);
        Assert.assertEquals(results,8);
    }

    @Test
    public void OneOrTwoStepsToSixStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(6);
        Assert.assertEquals(results,13);
    }

    @Test
    public void OneOrTwoStepsToThirteenStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(13);
        Assert.assertEquals(results,377);
    }

    @Test
    public void OneOrTwoStepsToFortyFiveStepsTest() {
        int results = ClimbingStairs.OneOrTwoStepsToNthStair(45);
        Assert.assertEquals(results,1836311903);
    }

    @Test
    public void OneTwoOrThreeStepsTo4StepsTest() {
        int results = ClimbingStairs.OneTwoOrThreeStepsToNthStair(4);
        Assert.assertEquals(results,7);
    }

}
