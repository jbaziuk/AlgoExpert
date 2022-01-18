package AlgoExpertTests.Easy;

import AlgoExpert.Easy.ValidateSubSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateSubSequenceTests {

    @Test
    public void defaultSequenceTest() {
        boolean result = ValidateSubSequence.isValidSubsequence(ValidateSubSequence.array, ValidateSubSequence.sequence);
        Assert.assertTrue(result);
    }


}
