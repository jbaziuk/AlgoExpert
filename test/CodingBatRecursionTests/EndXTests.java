package CodingBatRecursionTests;

import Recursion.EndX;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndXTests {

    @Test
    public void noXTest() {
        Assert.assertEquals(EndX.endX("hello"), "hello");
    }

    @Test
    public void simpleXTest() {
        Assert.assertEquals(EndX.endX("hello"), "hello");
    }

}
