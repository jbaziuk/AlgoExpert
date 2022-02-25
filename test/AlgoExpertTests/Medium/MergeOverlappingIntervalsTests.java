package AlgoExpertTests.Medium;

import AlgoExpert.Medium.MergeOverlappingIntervals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeOverlappingIntervalsTests {

    @Test
    public void longestPeakExample() {
        MergeOverlappingIntervals merge = new MergeOverlappingIntervals();
        int[][] results = merge.mergeOverlappingIntervals(new int[][] {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}});
        int[][] expected =  {{1, 2}, {3, 8}, {9, 10}};

        int counter = 0;
        for (int[] interval : results) {
            Assert.assertEquals(interval, expected[counter]);
            counter ++;
        }
    }



}
