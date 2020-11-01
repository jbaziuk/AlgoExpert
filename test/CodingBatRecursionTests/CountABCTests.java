package CodingBatRecursionTests;

import CodingBat.Recursion.CountABC;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountABCTests {

    @Test
    public void noTimes10Test() {
        Assert.assertEquals(CountABC.countAbc(("habcello")), 1);
    }

}
