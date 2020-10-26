package CodingBatRecursionTests;

import Recursion.CountPairs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPairsTests {

    @Test
    public void countOnePairTest() {
        Assert.assertEquals(CountPairs.countPairs(("hellol")), 1);
    }

}
