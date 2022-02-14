package AlgoExpertTests.Easy;

import AlgoExpert.Easy.MinimumWaitingTime;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumWaitingTimeTests {

    @Test
    public void minWaitTime() {
        MinimumWaitingTime min = new MinimumWaitingTime();
        int[] queries = {3,2,1,2,6};
        Assert.assertEquals(17, min.minimumWaitingTime(new int[]{3,2,1,2,6}));
    }

}
