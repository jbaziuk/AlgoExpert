package AlgoExpertTests.Medium;


import AlgoExpert.DataStructures.BST;
import AlgoExpert.Medium.ValidateBst;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidateBstTests {

    BST bst;

    @BeforeSuite
    public void beforeSuite() {
        bst = new BST(10);
        bst.insert(5).insert(15).insert(2).insert(5).insert(22).insert(1);
    }


    @Test
    public void treeIsValidBst() {

        List<Integer> list = new ArrayList<>();

        boolean result = ValidateBst.validateBst(bst);
        Assert.assertTrue(result);
    }

    @Test
    public void treeIsInvalidBst() {
        BST invalidBst = new BST(10);
        invalidBst.right = new BST(25);
        invalidBst.right.right = new BST(22);
        invalidBst.left = new BST(5);
        invalidBst.left.right = new BST(5);
        invalidBst.left.left = new BST(2);
        invalidBst.left.left.left = new BST(1);

        boolean result = ValidateBst.validateBst(invalidBst);
        Assert.assertFalse(result);
    }




}
