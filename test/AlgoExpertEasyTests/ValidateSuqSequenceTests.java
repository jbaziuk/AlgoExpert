package AlgoExpertEasyTests;

import Easy.ValidateSubSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateSuqSequenceTests {

    @Test
    public void defaultSequenceTest() {
        boolean result = ValidateSubSequence.isValidSubsequence2(ValidateSubSequence.array, ValidateSubSequence.sequence);
        Assert.assertTrue(result);
    }


}
