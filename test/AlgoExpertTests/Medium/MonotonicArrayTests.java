package AlgoExpertTests.Medium;

import AlgoExpert.Medium.MonotonicArray;
import org.testng.Assert;
import org.testng.annotations.Test;



public class MonotonicArrayTests {

    @Test
    public void isMonotonicNonIncreasing() {
        boolean result = MonotonicArray.isMonotonic( new int [] {-1, -5, -10, -1100, -1101, -1102, -9001});
        Assert.assertTrue (result);
    }

    @Test
    public void isMonotonicNonDecreasing() {
        boolean result = MonotonicArray.isMonotonic( new int [] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 8, 9, 10 , 11});
        Assert.assertTrue (result);
    }

    @Test
    public void isMonotonicFalse() {
        boolean result = MonotonicArray.isMonotonic( new int [] {-1,-5, -10, -1100, -900, -1102, -9001});
        Assert.assertFalse (result);
    }

}
