package AlgoExpertTests.Easy;

import AlgoExpert.Easy.FirstNonRepeatingCharacter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNonRepeatingCharacterTests {

    @Test
    public void canGenerateDocTest() {

        char[] ch1 = {'h', 'i'};
        String str1 = String.valueOf(ch1);
        String str2 = new String(ch1);


        String temp= "hello";
        char ch = temp.charAt(3);
        String myString = String.valueOf(ch);

        FirstNonRepeatingCharacter nonRepeatingChar = new FirstNonRepeatingCharacter();
        Assert.assertEquals(nonRepeatingChar.firstNonRepeatingCharacter("abcdcaf"), 1);
    }


}
