package Easy;

import DataStructures.BinaryTree;

public class NodeDepths {
    public static int sum = 0;
    public static int nodeDepths(BinaryTree root) {
        p(root, 0);
         return nodeDepthsHelper(root, 0);
    }

    public static int nodeDepthsHelper(BinaryTree root, int depth){
        if(root == null){
            System.out.println("Node is null\n");
            return 0;
        }
        sum+=depth;
        p(root, depth);

        return depth + nodeDepthsHelper(root.left, depth + 1) + nodeDepthsHelper(root.right, depth + 1);
    }

    public static void p(BinaryTree t, int depth)
    {
        System.out.println("Current node: " + t.value);
        System.out.println("Current depth: " + depth);
        System.out.println("Current sum: " + sum + "\n");
    }




}
