package AlgoExpertMediumTests;

import Medium.MoveElementToEnd;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEndTests {

    @Test
    public void FirstExampleThreeNumberSum() {

        List<Integer> expectedList = Arrays.asList(4, 1, 3, 2, 2, 2, 2, 2);

        List<Integer> results = MoveElementToEnd.moveElementToEnd(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2), 2);
        for (int i = 0; i < results.size(); i++) {
            Assert.assertEquals(expectedList.get(i), results.get(i));
        }
    }

}
