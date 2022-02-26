package AlgoExpertTests.Medium;

import AlgoExpert.DataStructures.LinkedList;
import AlgoExpert.Medium.ReverseLinkedList;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReverseLinkedListTests {

    LinkedList linkedList;

    @BeforeSuite
    public void beforeSuite() {
        linkedList = new LinkedList(0);
        linkedList.next = new LinkedList(1);
        linkedList.next.next = new LinkedList(2);
        linkedList.next.next.next = new LinkedList(3);
        linkedList.next.next.next.next = new LinkedList(4);
        linkedList.next.next.next.next.next = new LinkedList(5);
    }

    @Test
    public void reverse() {
        LinkedList result = ReverseLinkedList.reverseLinkedList(linkedList);
        Assert.assertEquals(result, result);
    }



}
