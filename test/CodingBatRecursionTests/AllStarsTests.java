package CodingBatRecursionTests;

import CodingBat.Recursion.AllStar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllStarsTests {

    @Test
    public void noTimes10Test() {
        Assert.assertEquals(AllStar.allStar(("hello")), "h*e*l*l*o");
    }

}
