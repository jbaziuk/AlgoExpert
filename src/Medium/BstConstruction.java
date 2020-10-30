package Medium;

public class BstConstruction {

    //I use a static nested class here but in DataStructures.BST I use a regular class for this work

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST currentNode = this;

            while (true) {
                if (value < currentNode.value) {
                    if (currentNode.left == null) {
                        currentNode.left = new BST(value);
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new BST(value);
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
            return this;
        }

        public BST insertRecursive(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = new BST(value);
                } else {
                    this.left.insertRecursive(value);
                }
            } else {
                if (this.right == null) {
                    this.right = new BST(value);
                } else {
                    this.right.insertRecursive(value);
                }
            }
            return this;
        }


    }

}
