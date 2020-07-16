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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        int reamaining = sum - root.val;
        return hasPathSum(root.left, reamaining) || hasPathSum(root.right, reamaining);
    }
}

public class Test {

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node2 = new TreeNode(4, node4, null);
        TreeNode node3 = new TreeNode(8, node5, node6);
        TreeNode node1 = new TreeNode(5, node2, node3);
        Solution solution = new Solution();
        boolean res = solution.hasPathSum(node1, 17);
        if (res) {
            System.out.println("路径存在");
        } else {
            System.out.println("路径不存在");
        }
    }
}
