package algorithm;

import java.awt.print.Pageable;

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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        boolean isBalanced = Math.abs(leftDepth - rightDepth) <= 1 ? true : false;
        return  isBalanced && isBalanced(root.left) && isBalanced(root.right);
    }

    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = treeDepth(root.left) + 1;
        int rightDepth = treeDepth(root.right) + 1;
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, null, node3);
        TreeNode node1 = new TreeNode(1, null, node2);
        boolean isBalanced = solution.isBalanced(node1);
        if (isBalanced) {
            System.out.println("平衡树");
        } else {
            System.out.println("非平衡树");
        }
    }
}
