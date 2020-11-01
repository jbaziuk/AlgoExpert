package CodingBatRecursionTests;

import CodingBat.Recursion.ChangePi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePiTests {

    @Test
    public void noChangePiTest() {
        Assert.assertEquals(ChangePi.changePi("xcodex"), "xcodex");
    }

    @Test
    public void simpleChangePiTest() {
        Assert.assertEquals(ChangePi.changePi("xfgpisdf"), "xfg3.14sdf");
    }

}
