package CodingBatRecursionTests;

import CodingBat.Recursion.NoX;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoXTests {

    @Test
    public void oneXRemovedTest() {
        Assert.assertEquals(NoX.noX("xcodex"), "code");
    }

    @Test
    public void twoXRemovedTest() {
        Assert.assertEquals(NoX.noX("xfgpixsdf"), "fgpisdf");
    }

}
