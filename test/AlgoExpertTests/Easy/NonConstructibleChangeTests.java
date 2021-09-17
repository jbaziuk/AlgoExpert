package AlgoExpertTests.Easy;

import AlgoExpert.Easy.NonConstructibleChange;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NonConstructibleChangeTests {

    @Test
    public void nonConstructiblCchangeReturned() {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        NonConstructibleChange ncc = new NonConstructibleChange();
        int results = ncc.nonConstructibleChange(coins);
        Assert.assertEquals(results, 20);
    }

    @Test
    public void emptyIntArrayReturns1() {
        int[] coins = {};
        NonConstructibleChange ncc = new NonConstructibleChange();
        int results = ncc.nonConstructibleChange(coins);
        Assert.assertEquals(results, 1);
    }

    @Test
    public void singleValueIntArrayReturns1() {
        int[] coins = {87};
        NonConstructibleChange ncc = new NonConstructibleChange();
        int results = ncc.nonConstructibleChange(coins);
        Assert.assertEquals(results, 1);
    }


}
