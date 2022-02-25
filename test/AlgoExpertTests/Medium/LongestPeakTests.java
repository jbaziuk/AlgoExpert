package AlgoExpertTests.Medium;

import AlgoExpert.Medium.LongestPeak;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestPeakTests {

    @Test
    public void longestPeakExample() {
        int result = LongestPeak.longestPeak(new int[] {1,2,3,3,4,0,10,6,5,-1,-3,2,3});
        Assert.assertEquals(result, 6);
    }

    @Test
    public void onePeak() {
        int result = LongestPeak.longestPeak(new int[] {0,4,2});
        Assert.assertEquals(result, 3);
    }

}
