package CodingBatRecursionTests;

import CodingBat.Recursion.SumDigets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDigetsTests {

    @Test
    public void sumDigetsTest() {
        Assert.assertEquals(SumDigets.sum(1111), 4);
    }

    @Test
    public void sumLargeDigetsTest() {
        Assert.assertEquals(SumDigets.sum(11111111), 8);
    }

}
