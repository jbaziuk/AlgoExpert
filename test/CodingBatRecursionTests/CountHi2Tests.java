package CodingBatRecursionTests;

import Recursion.CountHi2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountHi2Tests {

    @Test
    public void noCountHi2Test() { Assert.assertEquals(CountHi2.countHi2("aaa"), 0); }

    @Test
    public void oneCountHi2Test() {
        Assert.assertEquals(CountHi2.countHi2("aahia"), 1);
    }
}
