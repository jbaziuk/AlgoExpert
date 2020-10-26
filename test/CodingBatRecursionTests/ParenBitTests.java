package CodingBatRecursionTests;

import Recursion.ParenBit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParenBitTests {

    @Test
    public void getStuffInsideParenTest() {
        Assert.assertEquals(ParenBit.parenBit(("xyz(abc)123")), "(abc)");
    }

    @Test
    public void oneOffCenterInsideParenTest() {
        Assert.assertEquals(ParenBit.parenBit(("x(hello)")), "(hello)");
    }

}
