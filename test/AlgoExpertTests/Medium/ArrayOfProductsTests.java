package AlgoExpertTests.Medium;

import AlgoExpert.Medium.ArrayOfProducts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayOfProductsTests {

    @Test
    public void longestPeakExample() {
        ArrayOfProducts arrayOfProducts = new ArrayOfProducts();
        int[] result = arrayOfProducts.arrayOfProducts(new int[] {5, 1, 4, 2});
        Assert.assertEquals(result, new int[] {8, 40, 10, 20});
    }



}
