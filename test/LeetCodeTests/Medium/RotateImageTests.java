package LeetCodeTests.Medium;

import LeetCode.Medium.RotateImage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateImageTests {

    @Test
    public void traverseTest() {
        int[][] array = {{ 1, 2, 3,4 },
                        { 12,13,14,5 },
                        { 11,16,15,6 },
                        { 10, 9, 8,7 }};
        RotateImage.rotate90Degrees(array);
        Assert.assertEquals(array, array);
    }

    @Test
    public void smallArrayTraverseTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        RotateImage.rotate90DegreesNEW(array);
        Assert.assertEquals(array, array);
    }

    @Test
    public void threeByThreeTest() {
        int[][] array = {{1, 2, 3},
                         {8, 9, 4},
                         {7, 6, 5}};
        RotateImage.rotate90Degrees(array);
        Assert.assertEquals(array, array);
    }

    @Test
    public void oddShapeTest() {
        int[][] array = {{4, 2, 3, 6, 7, 8, 1, 9, 5, 10},
                {12, 19, 15, 16, 20, 18, 13, 17, 11, 14}};
        RotateImage.rotate90Degrees(array);
        Assert.assertEquals(array, array);
    }




}
