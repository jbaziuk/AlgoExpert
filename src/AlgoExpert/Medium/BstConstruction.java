package AlgoExpert.Medium;

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
            BST current = this;
            while (true) {
                if (value < current.value) {
                    if(current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new BST(value);
                        break;
                    }
                } else {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new BST(value);
                        break;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST current = this;
            while (current != null) {
                if (value < current.value) {
                    current = current.left;
                } else if (value > current.value) {
                    current = current.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove (value, null);
            return this;
        }

        public void remove(int value, BST parentNode) {
            BST currentNode = this;
            while (currentNode != null) {
                if (value < currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                } else {
                    if (currentNode.left != null && currentNode.right != null) {
                        currentNode.value = currentNode.right.getMinValue();
                        currentNode.right.remove(currentNode.value, currentNode);
                    } else if (parentNode == null) {
                        if (currentNode.left != null) {
                            currentNode.value = currentNode.left.value;
                            currentNode.right = currentNode.left.right;
                            currentNode.left = currentNode.left.left;
                        } else if (currentNode.right != null) {
                            currentNode.value = currentNode.right.value;
                            currentNode.left = currentNode.right.left;
                            currentNode.right = currentNode.right.right;
                        } else {
                            // this is a single node tree; do nothing
                        }
                    } else if (parentNode.left == currentNode) {
                        parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
                    } else if (parentNode.right == currentNode) {
                        parentNode.right = currentNode.left != null ? currentNode.left : currentNode.right;
                    }
                    break;
                }
            }
        }

        public int getMinValue() {
            if (left == null) {
                return value;
            } else {
                return left.getMinValue();
            }
        }
    }

}
