package CodingBatRecursionTests;

import Recursion.StringClean;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCleanTests {

    @Test
    public void strCleanTest() {
        Assert.assertEquals(StringClean.stringClean(("yyzzza")), "yza");
    }

}
