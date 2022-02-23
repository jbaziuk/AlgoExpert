package AlgoExpertTests.Medium;

import AlgoExpert.DataStructures.BST;
import AlgoExpert.Medium.FindKthLargestValueInBst;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FindKthLargestValueInBstTests {

    private BST bst;

    @BeforeSuite
    public void beforeSuite() {
        bst = new BST(15);
        bst.insert(5).insert(20).insert(2).insert(5).insert(1).insert(3).insert(17).insert(22);
    }

    @Test
    public void inorderTraversalTest() {
        FindKthLargestValueInBst largest = new FindKthLargestValueInBst();
        int result = largest.findKthLargestValueInBst(bst, 3);
        Assert.assertEquals(result, 17);
    }




}
