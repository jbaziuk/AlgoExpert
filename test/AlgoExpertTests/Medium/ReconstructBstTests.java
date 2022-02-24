package AlgoExpertTests.Medium;

import AlgoExpert.DataStructures.BST;
import AlgoExpert.Medium.ReconstructBst;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReconstructBstTests {

    private BST bst;

    @BeforeSuite
    public void beforeSuite() {
        bst = new BST(10);
        bst.insert(4).insert(17).insert(2).insert(5).insert(1).insert(19).insert(18);
    }

    @Test
    public void createBstFromListUsingPreorderTraversalTest() {
        List<Integer> preOrderTraversalValues = new ArrayList<>(Arrays.asList(10,4,2,1,5,17,19,18));
        ReconstructBst tree = new ReconstructBst();
        BST result = tree.reconstructBst(preOrderTraversalValues);

        List<Integer> preOrderTraversalValuesResult = new ArrayList<>();
        BST.preOrderTraverse(result, preOrderTraversalValuesResult);

        int counter = 0;
        for (Integer num : preOrderTraversalValues) {
            Assert.assertEquals(num, preOrderTraversalValuesResult.get(counter));
            counter ++;
        }
    }

}
