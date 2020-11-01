package AlgoExpert.Easy;

import AlgoExpert.DataStructures.BST;

public class FindClosetValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        BST currentNode = tree;
        int closest = currentNode.value;
        while (currentNode != null) {
            int targetClosestABS = Math.abs(target - closest);
            int targetCurrentABS = Math.abs(target - currentNode.value);

            //if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
            if (targetClosestABS > targetCurrentABS) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }

    //Gotta use Math.abs to find closest value
    public static int findClosestValueInBstBAD(BST tree, int target) {
        int cv;
        BST current = tree;
        while (true) {
            if (target < current.value) {
                if (current.left == null) {
                    cv = current.value;
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    cv = current.value;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return cv;
    }

}
