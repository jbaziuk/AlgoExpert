package CodingBatRecursionTests;

import Recursion.PowerOfN;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfNTests {

    @Test
    public void powerOneTest() { Assert.assertEquals(PowerOfN.powerN(3, 1), 3); }

    @Test
    public void powerTwoTest() {
        Assert.assertEquals(PowerOfN.powerN(7, 2), 49);
    }

    @Test
    public void powerFourTest() {
        Assert.assertEquals(PowerOfN.powerN(2, 4), 16);
    }

    @Test
    public void powerSevenTest() {
        Assert.assertEquals(PowerOfN.powerN(9, 7), 4782969);
    }
}





