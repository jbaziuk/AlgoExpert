package CodingBatRecursionTests;

import Recursion.Array220;
import Recursion.ArraySix;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Array220Tests {

    @Test
    public void noTimes10Test() {
        Assert.assertFalse(Array220.array220(new int[]{1,2,3}, 0));
    }

    @Test
    public void simpleTimes10Test() {
        Assert.assertTrue(Array220.array220(new int[]{1, 2, 20}, 0));
    }

    @Test
    public void simpleTimesFalseTest() {
        Assert.assertFalse(Array220.array220(new int[]{2, 19, 4}, 0));
    }



}
