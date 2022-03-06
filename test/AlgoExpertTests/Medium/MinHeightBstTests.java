package AlgoExpertTests.Medium;

import AlgoExpert.DataStructures.BST;
import AlgoExpert.Medium.MinHeightBst;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MinHeightBstTests {

    @Test
    public void longestPeakExample() {
        BST bst = MinHeightBst.minHeightBst(new ArrayList<>(Arrays.asList(1,2,5,7,10,13,14,15,22)));
    }



}
