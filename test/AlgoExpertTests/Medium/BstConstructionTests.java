package AlgoExpertTests.Medium;

import AlgoExpert.Medium.BstConstruction.BST;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BstConstructionTests {

    private BST bst;

    @BeforeSuite
    public void beforeSuite() {
        bst = new BST(10);
        bst.insert(5).insert(15).insert(2).insert(5).insert(22).insert(1);
    }

    @Test
    public void containsTrue() {
        Assert.assertTrue(bst.contains(22));
    }

    @Test
    public void removeLeafNode() {
        bst.remove(22);
        Assert.assertFalse(bst.contains(22));
    }

    @Test
    public void removeRootWithContainsFalse() {
        bst.remove(10);
        Assert.assertFalse(bst.contains(10));
    }




}
