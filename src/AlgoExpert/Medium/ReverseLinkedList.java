package AlgoExpert.Medium;

import AlgoExpert.DataStructures.LinkedList;

public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList previousNode = null;
        LinkedList currentNode = head;

        while (currentNode != null) {
            LinkedList nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

}
