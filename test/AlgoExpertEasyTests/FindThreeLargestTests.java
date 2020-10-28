package AlgoExpertEasyTests;

import Easy.FindThreeLargestNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FindThreeLargestTests {

    @Test
    public void canBeFound() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);


        int[] array = {71, 0, 1, 21, 73, 33, 45, 45, 61, 72,};
        Assert.assertEquals(new int[]{71, 72, 73}, FindThreeLargestNumbers.findThreeLargestNumbers(array));
    }

}
