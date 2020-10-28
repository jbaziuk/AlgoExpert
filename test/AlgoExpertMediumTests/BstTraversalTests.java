package AlgoExpertMediumTests;

import DataStructures.BST;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BstTraversalTests {

    private BST bst;

    @BeforeSuite
    public void beforeSuite() {
        bst = new BST(10);
        bst.insert(5).insert(15).insert(2).insert(5).insert(22).insert(1);
    }

    @Test
    public void inorderTraversalTest() {
        List<Integer> result = BST.inOrderTraverse(bst, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(1, 2, 5, 5, 10, 15, 22);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void preorderTraversalTest() {
        List<Integer> result = BST.preOrderTraverse(bst, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(10, 5, 2, 1, 5, 15, 22);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void postorderTraversalTest() {
        List<Integer> result = BST.postOrderTraverse(bst, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(1, 2, 5, 5, 22, 15, 10);
        Assert.assertEquals(expectedResult, result);
    }


}
