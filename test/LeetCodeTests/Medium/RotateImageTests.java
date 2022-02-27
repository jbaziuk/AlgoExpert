package LeetCodeTests.Medium;

import LeetCode.Medium.RotateImage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateImageTests {

    @Test
    public void RotateTest() {
        int[][] array = {{ 1, 2, 3,4 },
                        { 12,13,14,5 },
                        { 11,16,15,6 },
                        { 10, 9, 8,7 }};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void smallRotateForwardTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void smallRotateBackwardsTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        RotateImage.rotate(array, "back");
        Assert.assertEquals(array, array);
    }

    @Test
    public void threeByThreeTest() {
        int[][] array = {{1, 2, 3},
                         {8, 9, 4},
                         {7, 6, 5}};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

}
