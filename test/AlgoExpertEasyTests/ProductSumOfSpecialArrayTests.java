package AlgoExpertEasyTests;

import Easy.ProductSumOfSpecialArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ProductSumOfSpecialArrayTests {

    @Test
    public void sumIsFoundcanBeFound(){
        int [] t = {};
        int[] temp = {1,2,3};
        String[] temp2 = {"123", "123"};
        List<Object> firstInnerList = Arrays.asList(7, -1);
        List<Object> innerInnerList = Arrays.asList(-13, 8);
        List<Object> myarr = Arrays.asList(6, innerInnerList, 4);
        List<Object> myList2 = Arrays.asList(5, 2, firstInnerList, 3, myarr);
        //Assert.assertEquals(3, ProductSumOfSpecialArray.productSum(myList2));
    }
}
