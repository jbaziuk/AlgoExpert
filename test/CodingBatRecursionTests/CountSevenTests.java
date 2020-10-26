package CodingBatRecursionTests;

import Recursion.CountSeven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountSevenTests {

    @Test
    public void sumSevenTest() {
        Assert.assertEquals(CountSeven.count7(1711), 1);
    }

    @Test
    public void sumSevenMultiTest() {
         Assert.assertEquals(CountSeven.count7(27177), 3);
    }

}
