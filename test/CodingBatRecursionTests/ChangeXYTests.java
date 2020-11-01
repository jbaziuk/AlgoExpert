package CodingBatRecursionTests;

import CodingBat.Recursion.ChangeXY;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeXYTests {

    @Test
    public void simpleChangeXyTest() {
        Assert.assertEquals(ChangeXY.changeXY("xcodex"), "ycodey");
    }

}
