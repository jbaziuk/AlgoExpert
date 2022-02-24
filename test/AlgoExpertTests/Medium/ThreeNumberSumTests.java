package AlgoExpertTests.Medium;

import AlgoExpert.Medium.ThreeNumberSum;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ThreeNumberSumTests {

    @Test
    public void firstExampleThreeNumberSum() {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        List<Integer[]> expectedList = new ArrayList<>();
        expectedList.add(new Integer[]{-8, 2, 6});
        expectedList.add(new Integer[]{-8, 3, 5});
        expectedList.add(new Integer[]{-6, 1, 5});
        List<Integer[]> results = ThreeNumberSum.threeNumberSum(array, 0);
        for (int i = 0; i < results.size(); i++) {
            Assert.assertEquals(expectedList.get(i), results.get(i));
        }
    }

}
