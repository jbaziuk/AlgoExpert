package Extra;

import AlgoExpert.DataStructures.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeTraversalTests {

    private BinaryTree tree;
    private BinaryTree tree2;

    @BeforeSuite
    public void beforeSuite() {
        tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);

        tree2 = new BinaryTree(1);
        tree2.left = new BinaryTree(2);
        tree2.right = new BinaryTree(3);
        tree2.left.left = new BinaryTree(4);
        tree2.left.right = new BinaryTree(5);
    }

    @Test
    public void inorderTraversalTest() {
        List<Integer> result = BinaryTree.inOrderTraverse(tree, new ArrayList<>());
        List<Integer> result2 = BinaryTree.inOrderTraverse(tree2, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(2, 1, 3);
        List<Integer> expectedResult2 = Arrays.asList(4, 2, 5, 1, 3);
        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(expectedResult2, result2);
    }

    @Test
    public void preorderTraversalTest() {
        List<Integer> result = BinaryTree.preOrderTraverse(tree, new ArrayList<>());
        List<Integer> result2 = BinaryTree.preOrderTraverse(tree2, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(1, 2, 3);
        List<Integer> expectedResult2 = Arrays.asList(1, 2, 4, 5, 3);
        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(expectedResult2, result2);
    }

    @Test
    public void postorderTraversalTest() {
        List<Integer> result = BinaryTree.postOrderTraverse(tree, new ArrayList<>());
        List<Integer> result2 = BinaryTree.postOrderTraverse(tree2, new ArrayList<>());
        List<Integer> expectedResult = Arrays.asList(2, 3, 1);
        List<Integer> expectedResult2 = Arrays.asList(4, 5, 2, 3, 1);
        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(expectedResult2, result2);
    }


}
