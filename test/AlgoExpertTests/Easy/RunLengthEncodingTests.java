package AlgoExpertTests.Easy;

import AlgoExpert.Easy.RunLengthEncoding;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunLengthEncodingTests {

    @Test
    public void canEncodeTest() {
        RunLengthEncoding encode = new RunLengthEncoding();
        Assert.assertEquals(encode.runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"), "9A4A2B4C2D");
    }

    @Test
    public void canEncodeSmallStringTest() {
        RunLengthEncoding encode = new RunLengthEncoding();
        Assert.assertEquals(encode.runLengthEncoding("aA"), "1a1A");
    }


}
