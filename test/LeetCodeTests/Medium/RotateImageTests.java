package LeetCodeTests.Medium;

import LeetCode.Medium.RotateImage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RotateImageTests {



    @Test
    public void rotate2x2ForwardsTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void rotate2x2BackwardsTest() {
        int[][] array = {{ 1, 2 },
                         { 4, 3 }};
        RotateImage.rotate(array, "back");
        Assert.assertEquals(array, array);
    }

    @Test
    public void rotate3x3ForwardsTest() {
        int[][] array = {{1, 2, 3},
                         {8, 9, 4},
                         {7, 6, 5}};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void rotate4x4ForwardsTest() {
        int[][] array = {{ 1, 2, 3,4 },
                        { 12,13,14,5 },
                        { 11,16,15,6 },
                        { 10, 9, 8,7 }};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void rotate5x5ForwardsTest() {
        int[][] array = {{1, 2, 3, 4, 5 },
                         {16,17,18,19, 6  },
                         {15,24,25,20, 7 },
                         {14,23,22,21, 8 },
                         {13,12,11,10, 9 }};
        RotateImage.rotate(array, "forward");
        Assert.assertEquals(array, array);
    }

    @Test
    public void rotate5x5BackwardsTest() {
        int[][] array = {{1, 2, 3, 4, 5 },
                {16,17,18,19, 6  },
                {15,24,25,20, 7 },
                {14,23,22,21, 8 },
                {13,12,11,10, 9 }};
        RotateImage.rotate(array, "back");
        Assert.assertEquals(array, array);
    }

}
