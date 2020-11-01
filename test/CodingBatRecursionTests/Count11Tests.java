package CodingBatRecursionTests;

import CodingBat.Recursion.Count11;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Count11Tests {

    @Test
    public void noTimes10Test() {
        Assert.assertEquals(Count11.count11("h11rtyo"), 1);
    }

}
