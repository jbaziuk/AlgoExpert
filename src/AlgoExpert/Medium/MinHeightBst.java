package AlgoExpert.Medium;

import AlgoExpert.DataStructures.BST;

import java.util.List;

public class MinHeightBst {

    public static BST minHeightBst(List<Integer> array) {
        return minHeightBst(array, null, 0, array.size() - 1);
    }

    private static BST minHeightBst(List<Integer> array, BST bst, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }

        int mid = (startIndex + endIndex) / 2;
        BST newBstNode = new BST(array.get(mid));

        if (bst == null) {
            bst = newBstNode;
        } else {
            if (array.get(mid) < bst.value){
                bst.left = newBstNode;
                bst = bst.left;
            } else {
                bst.right = newBstNode;
                bst = bst.right;
            }
        }
        minHeightBst(array, bst, startIndex, mid - 1);
        minHeightBst(array, bst, mid + 1, endIndex);
        return bst;
    }


}
