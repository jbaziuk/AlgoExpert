package AlgoExpertTests.Medium;

import AlgoExpert.Medium.Permutations;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTests {

    @Test
    public void permSimpleExample() {
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1,2,3));
        expectedResults.add(Arrays.asList(1,3,2));
        expectedResults.add(Arrays.asList(2,1,3));
        expectedResults.add(Arrays.asList(2,3,1));
        expectedResults.add(Arrays.asList(3,1,2));
        expectedResults.add(Arrays.asList(3,2,1));
        List<List<Integer>> results = Permutations.getPermutations(new ArrayList<>(Arrays.asList(1,2,3)));
        Assert.assertEquals(results, expectedResults);
    }

    @Test
    public void permUsingSwap() {
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1,2,3));
        expectedResults.add(Arrays.asList(1,3,2));
        expectedResults.add(Arrays.asList(2,1,3));
        expectedResults.add(Arrays.asList(2,3,1));
        expectedResults.add(Arrays.asList(3,2,1));
        expectedResults.add(Arrays.asList(3,1,2));
        List<List<Integer>> results = Permutations.getPermutationsUsingSwap(new ArrayList<>(Arrays.asList(1,2,3)));
        Assert.assertEquals(results, expectedResults);
    }



}
