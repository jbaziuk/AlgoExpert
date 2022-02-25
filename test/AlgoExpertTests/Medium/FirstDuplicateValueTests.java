package AlgoExpertTests.Medium;

import AlgoExpert.Medium.FirstDuplicateValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDuplicateValueTests {

    @Test
    public void findFirstDupValueUsingNegativeMarking() {
        int[] array = {2, 1, 5, 2, 3, 3, 4};
        FirstDuplicateValue dup = new FirstDuplicateValue();
        int result = dup.firstDuplicateValueUsingNegativeMarking(array);
        Assert.assertEquals(result, 2);
    }

}
