class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SumRootToLeaf {


    public static int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = (current << 1) | node.val;


        if (node.left == null && node.right == null) {
            return current;
        }

        return dfs(node.left, current) + dfs(node.right, current);
    }

    public static void main(String[] args) {

        /*
               1
              / \
             0   1
            / \ / \
           0  1 0  1

        Binary numbers:
        100 = 4
        101 = 5
        110 = 6
        111 = 7

        Sum = 22
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        int result = sumRootToLeaf(root);

        System.out.println("Sum of root-to-leaf binary numbers: " + result);
    }
}