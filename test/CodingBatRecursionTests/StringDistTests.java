package CodingBatRecursionTests;

import CodingBat.Recursion.StringDist;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringDistTests {

    @Test
    public void getSubStringDistanceTest() {
        Assert.assertEquals(StringDist.strDist("catcowcat", "cat"), 9);
    }

}
