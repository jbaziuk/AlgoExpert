package CodingBatRecursionTests;

import CodingBat.Recursion.CountHi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountHiTests {

    @Test
    public void noCountHiTest() {
        Assert.assertEquals(CountHi.countHi("aaa"), 0);
    }

    @Test
    public void oneCountHiTest() {
        Assert.assertEquals(CountHi.countHi("aahia"), 1);
    }

    @Test
    public void twoCountHiTest() {
        Assert.assertEquals(CountHi.countHi("ahiahia"), 2);
    }

    @Test
    public void notLowerTest() {
        Assert.assertEquals(CountHi.countHi("aHiahIa"), 0);
    }


}
