package AlgoExpertTests.Medium;

import AlgoExpert.Medium.MonotonicArray;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MonotonicArrayTests {

    @Test
    public void isMonotonicDecreasing() {
        boolean result = MonotonicArray.isMonotonic( new int [] {-1,-5, -10, -1100, -1101, -1102, -9001});
        Assert.assertTrue (result);
    }

    @Test
    public void isMonotonicFalse() {
        boolean result = MonotonicArray.isMonotonic( new int [] {-1,-5, -10, -1100, -900, -1102, -9001});
        Assert.assertFalse (result);
    }

}
