package AlgoExpertEasyTests;

import Easy.BranchSums;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BranchSumsTests {
    private BranchSums.BinaryTree bt;

    @BeforeMethod
    public void beforeMethod(){
        bt = new BranchSums.BinaryTree(1);
        bt.left = new BranchSums.BinaryTree(2);
        bt.right = new BranchSums.BinaryTree(3);
        bt.left.left = new BranchSums.BinaryTree(4);
        bt.left.right = new BranchSums.BinaryTree(5);
        bt.left.left.left = new BranchSums.BinaryTree(8);
        bt.left.left.right = new BranchSums.BinaryTree(9);
        bt.left.right.left = new BranchSums.BinaryTree(10);
        bt.right.left = new BranchSums.BinaryTree(6);
        bt.right.right = new BranchSums.BinaryTree(7);
    }

    @Test
    public void defaultBranchSumTest(){
        List<Integer> result = BranchSums.branchSums(bt);
        List<Integer> myList = Arrays.asList(15, 16, 18, 10, 11);
        Assert.assertEquals(result, myList);
    }

    @Test
    public void oneNodeBranchSumTest(){
        List<Integer> result = BranchSums.branchSums(new BranchSums.BinaryTree(1));
        List<Integer> myList = Arrays.asList(1);
        Assert.assertEquals(result, myList);
    }

    @Test
    public void twoNodeBranchSumTest(){
        BranchSums.BinaryTree bt = new BranchSums.BinaryTree(1);
        bt.left = new BranchSums.BinaryTree(2);
        List<Integer> result = BranchSums.branchSums(bt);
        List<Integer> myList = Collections.singletonList(3);
        Assert.assertEquals(result, myList);
    }




}
