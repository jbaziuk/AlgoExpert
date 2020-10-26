package CodingBatRecursionTests;

import Recursion.PairStar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PairStarTests {

    @Test
    public void pairStarTest() {
        Assert.assertEquals(PairStar.pairStar(("hello")), "hel*lo");
    }

}
