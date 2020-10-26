package AlgoExpertEasyTests;

import Easy.Fibonacci;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTests {

    @Test
    public void easyFibTest(){
        Assert.assertEquals(1, Fibonacci.getNthFib(5));
    }

    @Test
    public void largeNumberTest(){
        Assert.assertEquals(1836311903, Fibonacci.getNthFib(47));
    }






}
