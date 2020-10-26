package DataStructures;

import java.util.List;

public class BST {


    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    public BST insert(int value) {
        if (value < this.value) {
            if (left == null) {
                left = new BST(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BST(value);
            } else {
                right.insert(value);
            }
        }
        return this;
    }

    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null) {
            inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
            inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        array.add(tree.value);
        if (tree.left != null) {
            preOrderTraverse(tree.left, array);
        }
        if (tree.right != null) {
            preOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
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





