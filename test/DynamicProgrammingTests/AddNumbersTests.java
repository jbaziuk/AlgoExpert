package DynamicProgrammingTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNumbersTests {

    @Test
    public static void addNumbersTest() {
        int result = DynamicProgramming.AddNumbers.addNumbersToN(3);
        Assert.assertEquals(result, 6);
    }

}
