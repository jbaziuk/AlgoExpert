package CodingBatRecursionTests;

import Recursion.StringCount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCountTests {

    @Test
    public void noTimes10Test() {
        Assert.assertEquals(StringCount.strCount("catcowcat", "cat"), 2);
    }

}
