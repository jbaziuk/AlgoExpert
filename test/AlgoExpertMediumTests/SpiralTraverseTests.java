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

    @Test
    public void smallArrayTraverseTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        List<Integer> result = SpiralTraverse.spiralTraverse(array);
        List<Integer> expectedResult = Arrays.asList(1,2,3,4);
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void threeByThreeTest() {
        int[][] array = {{1, 2, 3},
                         {8, 9, 4},
                         {7, 6, 5}};
        List<Integer> result = SpiralTraverse.spiralTraverse(array);
        List<Integer> expectedResult = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void oddShapeTest() {
        int[][] array = {{4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
                {12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};
        List<Integer> result = SpiralTraverse.spiralTraverse(array);
        List<Integer> expectedResult = Arrays.asList(4,2,3,6,7,8,1,9,5,10,14,11,17,13,18,20,16,15,19,12);
        Assert.assertEquals(result, expectedResult);
    }




}
