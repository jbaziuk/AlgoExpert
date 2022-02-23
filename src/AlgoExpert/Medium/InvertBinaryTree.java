package AlgoExpert.Medium;

import AlgoExpert.DataStructures.BinaryTree;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null){
            return;
        }
        swap(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    private static void swap(BinaryTree tree) {
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = left;
    }


}
