package AlgoExpertTests.Easy;

import AlgoExpert.DataStructures.BinaryTree;
import AlgoExpert.Easy.NodeDepths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NodeDepthsTests {
    BinaryTree bt;

    @BeforeMethod
    public void beforeMethod() {
        bt = new BinaryTree(1);
        bt.left = new BinaryTree(2);
        bt.right = new BinaryTree(3);
        bt.left.left = new BinaryTree(4);
        bt.left.right = new BinaryTree(5);
        bt.left.left.left = new BinaryTree(8);
        bt.left.left.right = new BinaryTree(9);
        bt.right.left = new BinaryTree(6);
        bt.right.right = new BinaryTree(7);
    }

    @Test
    public void defaultBranchSumTest() {
        int result = NodeDepths.nodeDepths(bt);
        Assert.assertEquals(result, 16);
    }

    @Test
    public void smallBranchSumTest() {
        BinaryTree bt2 = new BinaryTree(1);
        bt2.left = new BinaryTree(2);
        bt2.right = new BinaryTree(3);
        int result = NodeDepths.nodeDepths(bt2);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void anotherSmallBranchSumTest() {
        BinaryTree bt2 = new BinaryTree(1);
        bt2.left = new BinaryTree(2);
        int result = NodeDepths.nodeDepths(bt2);
        Assert.assertEquals(result, 1);
    }


    @Test
    public void reallySmallBranchSumTest() {
        BinaryTree bt2 = new BinaryTree(1);
        int result = NodeDepths.nodeDepths(bt2);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void midSumTest() {
        BinaryTree bt2 = new BinaryTree(1);
        bt2.left = new BinaryTree(2);
        bt2.right = new BinaryTree(3);
        bt2.left.left = new BinaryTree(4);
        bt2.left.right = new BinaryTree(5);
        int result = NodeDepths.nodeDepths(bt2);
        Assert.assertEquals(result, 6);
    }

}
