package AlgoExpertTests.Easy;

import AlgoExpert.Easy.FirstNonRepeatingCharacter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNonRepeatingCharacterTests {

    @Test
    public void canGenerateDocTest() {
        FirstNonRepeatingCharacter nonRepeatingChar = new FirstNonRepeatingCharacter();
        Assert.assertEquals(nonRepeatingChar.firstNonRepeatingCharacter("abcdcaf"), 1);
    }


}
