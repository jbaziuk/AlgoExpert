package CodingBatRecursionTests;

import CodingBat.Recursion.CountEight;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountEightTests {

    @Test
    public void noCountSumEightTest() {
        Assert.assertEquals(CountEight.count8(1711), 0);
    }

    @Test
    public void sumEightOnceTest() {
        Assert.assertEquals(CountEight.count8(1781), 1);
    }

    @Test
    public void sumEightTwiceOnceTest() {
        Assert.assertEquals(CountEight.count8(8781), 2);
    }

    @Test
    public void sumEightDoubleCountTest() {
        Assert.assertEquals(CountEight.count8(8881), 5);
    }

    @Test
    public void sumEightDoubleCount2Test() {
        Assert.assertEquals(CountEight.count8(8888), 7);
    }


}
