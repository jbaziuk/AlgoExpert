package AlgoExpertMediumTests;

import Medium.SpiralTraverse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralTraverseTests {

    @Test
    public void traverseTest() {
        int[][] array = {{ 1, 2, 3,4 },
                        { 12,13,14,5 },
                        { 11,16,15,6 },
                        { 10, 9, 8,7 }};

        List<Integer> result = SpiralTraverse.spiralTraverse(array);
        List<Integer> expectedResult = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        Assert.assertEquals(result, expectedResult);
    }




}
