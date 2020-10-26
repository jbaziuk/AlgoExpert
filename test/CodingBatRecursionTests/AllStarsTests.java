package CodingBatRecursionTests;

import Recursion.AllStar;
import Recursion.Array220;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllStarsTests {

    @Test
    public void noTimes10Test() {
        Assert.assertEquals(AllStar.allStar(("hello")), "h*e*l*l*o");
    }

}
