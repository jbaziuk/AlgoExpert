package CodingBatRecursionTests;

import Recursion.NestParen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestParenTests {

    @Test
    public void checkIfNestedParenTrueTest() {
        Assert.assertTrue(NestParen.nestParen("((()))"));
    }

    @Test
    public void checkIfNestedParenFalseTest() {
        Assert.assertFalse(NestParen.nestParen("(((x))"));
    }

}
