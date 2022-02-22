package CodingBatRecursionTests;

import CodingBat.Recursion.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTests {

    @Test
    public void getNumberOfBlockInTriangleTest() {
        Assert.assertEquals(Triangle.triangle(3), 6);
    }


    @Test
    public void getNumberOfBlockInTriangleTest2() {
        Assert.assertEquals(Triangle.triangle(5), 15);
    }


    @Test
    public void getHugeNumberOfBlocks() {
        Assert.assertEquals(Triangle.triangle(5000), 12502500);
    }
}
