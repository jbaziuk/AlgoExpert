package CodingBatRecursionTests;

import Recursion.ArraySix;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySixTests {

    @Test
    public void no6Test() {
        Assert.assertFalse(ArraySix.array6(new int[]{1, 2, 3}, 0));
    }

    @Test
    public void oneSixTest() {
        Assert.assertTrue(ArraySix.array6(new int[]{1, 2, 6, 3}, 0));
    }

    @Test
    public void twoSixTest() {
        Assert.assertTrue(ArraySix.array6(new int[]{1, 6, 2, 6, 3}, 0));
    }

    @Test
    public void indexDoesNotSeeSixTest() {
        Assert.assertFalse(ArraySix.array6(new int[]{6, 2, 3}, 1));
    }


}
