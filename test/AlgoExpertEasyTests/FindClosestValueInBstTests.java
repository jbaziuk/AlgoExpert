package AlgoExpertEasyTests;

import DataStructures.BST;
import Easy.FindClosetValueInBST;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindClosestValueInBstTests {

    @Test
    public void findClosestValueTest() {
        BST bst = new BST(10);
        bst.insert(10).insert(5).insert(15).insert(2).insert(5).insert(13).insert(22).insert(14).insert(1);

        int result = FindClosetValueInBST.findClosestValueInBst(bst, 12);
        Assert.assertEquals(13, result);
    }


}
