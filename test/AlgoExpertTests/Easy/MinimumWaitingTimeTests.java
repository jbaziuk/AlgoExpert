package AlgoExpertTests.Easy;

import AlgoExpert.Easy.MinimumWaitingTime;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumWaitingTimeTests {

    @Test
    public void minWaitTime() {
        MinimumWaitingTime min = new MinimumWaitingTime();
        int[] queries = {3,2,1,2,6};
        Assert.assertEquals( min.minimumWaitingTime(queries),17);
    }

    @Test
    public void minWaitTimeWithAllOnes() {
        MinimumWaitingTime min = new MinimumWaitingTime();
        int[] queries = {1, 1, 1, 1, 1};
        Assert.assertEquals(min.minimumWaitingTime(queries),10);
    }

}
