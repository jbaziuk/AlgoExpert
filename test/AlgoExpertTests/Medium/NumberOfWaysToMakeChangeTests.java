package AlgoExpertTests.Medium;

import AlgoExpert.Medium.NumberOfWaysToMakeChange;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfWaysToMakeChangeTests {

    @Test
    public void waysToMakeChangeSimpleExample() {

        int result = NumberOfWaysToMakeChange.numberOfWaysToMakeChange(6, new int[] {1, 5});
        Assert.assertEquals(result, 2);
    }

    @Test
    public void waysToMakeChangeSimpleExample2() {
        int result = NumberOfWaysToMakeChange.numberOfWaysToMakeChange(5, new int[] {1, 2, 5});
        Assert.assertEquals(result, 4);
    }

}
