package CodingBatRecursionTests;

import CodingBat.Recursion.CountOfX;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfXTests {

    @Test
    public void simpleCountXTest() {
        Assert.assertEquals(CountOfX.countX("xaaa"), 1);
    }


}
