package AlgoExpertTests.Medium;

import AlgoExpert.DataStructures.BinaryTree;
import AlgoExpert.Medium.InvertBinaryTree;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InvertBinaryTreeTests {
    private BinaryTree tree;

    @BeforeSuite
    public void beforeSuite() {
        tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.right = new BinaryTree(5);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

    }

    @Test
    public void createBstFromListUsingPreorderTraversalTest() {
        InvertBinaryTree.invertBinaryTree(tree);
        Assert.assertEquals(tree.left.value, 3);
        Assert.assertEquals(tree.right.value, 2);
        Assert.assertEquals(tree.left.left.value, 7);
    }

}
