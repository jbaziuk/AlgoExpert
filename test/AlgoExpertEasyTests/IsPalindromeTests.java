package AlgoExpertEasyTests;

import Easy.IsPalindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPalindromeTests {

    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(IsPalindrome.isPalindrome("abcdcba"));
    }


}
