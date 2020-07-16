package algorithm;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        int leftDepth = minDepth(root.left) + 1;
        int rightDepth = minDepth(root.right) + 1;
        return leftDepth < rightDepth ? leftDepth : rightDepth;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20, node4, node5);
        TreeNode node1 = new TreeNode(3, node2, node3);
        int depth = solution.minDepth(node1);
        System.out.println("树的高度:" + depth);
    }
}
