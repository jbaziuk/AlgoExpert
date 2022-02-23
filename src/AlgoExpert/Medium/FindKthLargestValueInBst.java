package AlgoExpert.Medium;

import AlgoExpert.DataStructures.BST;

public class FindKthLargestValueInBst {

    static class TreeInfo {
        public int numberOfNodesVisited;
        public int kthLargestNodeValue;

        public TreeInfo(int num, int nodeValue) {
            this.numberOfNodesVisited = num;
            this.kthLargestNodeValue = nodeValue;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        TreeInfo info = new TreeInfo(0, -1);
        getKthLargestValue(tree, k, info);
        return info.kthLargestNodeValue;
    }

    public void getKthLargestValue(BST tree, int k, TreeInfo treeInfo) {
        if (tree == null || treeInfo.numberOfNodesVisited >= k) {
            return;
        }

        if (tree.right != null) {
            getKthLargestValue(tree.right, k, treeInfo);
        }

        treeInfo.numberOfNodesVisited += 1;
        if (treeInfo.numberOfNodesVisited == k) {
            treeInfo.kthLargestNodeValue = tree.value;
        }

        if (tree.left != null) {
            getKthLargestValue(tree.left, k, treeInfo);
        }
    }

}
