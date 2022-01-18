package AlgoExpert.DataStructures;

import java.util.List;

public class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static List<Integer> inOrderTraverse(BinaryTree tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BinaryTree tree, List<Integer> array) {
        array.add(tree.value);
        if (tree.left != null) {
            preOrderTraverse(tree.left, array);
        }
        if (tree.right != null) {
            preOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BinaryTree tree, List<Integer> array) {
        if (tree.left != null) {
            postOrderTraverse(tree.left, array);
        }
        if (tree.right != null) {
            postOrderTraverse(tree.right, array);
        }
        array.add(tree.value);
        return array;
    }
}
