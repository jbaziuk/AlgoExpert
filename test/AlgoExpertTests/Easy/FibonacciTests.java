package AlgoExpertTests.Easy;

import AlgoExpert.Easy.Fibonacci;
import Util.TimeMe;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTests {

    @Test
    public void easyFibTest() {
        Assert.assertEquals(Fibonacci.getNthFibUsingDynamicProgrammingUsingForLoop(6), 5);
    }

    @Test
    public void largeNumberTest() {
        TimeMe timer = new TimeMe();
        timer.start();
        Assert.assertEquals(Fibonacci.getNthFibUsingDynamicProgrammingUsingForLoop2(500), 2081405077);
        timer.stop();
        timer.getElapsedTimeSecs();
    }

    @Test
    public void recursiveTest() {
        TimeMe timer = new TimeMe();
        timer.start();
        Assert.assertEquals(Fibonacci.getNthFibRecursive(10), 34);
        timer.stop();
        timer.getElapsedTimeSecs();
    }

    @Test
    public void recursiveWithMemoizationTest() {
        TimeMe timer = new TimeMe();
        timer.start();
        Assert.assertEquals(Fibonacci.getNthFibUsingRecursiveWithMemoization(10), 34);
        timer.stop();
        timer.getElapsedTimeSecs();
    }

}
