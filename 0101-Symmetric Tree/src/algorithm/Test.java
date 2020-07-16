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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            boolean isLeft = isSymmetricTree(left.left, right.right);
            boolean isRight = isSymmetricTree(left.right, right.left);
            return left.val == right.val && isLeft && isRight;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(2, node6, node7);
        TreeNode node1 = new TreeNode(1, node2, node3);
        boolean res = solution.isSymmetric(node1);
        if (res) {
            System.out.println("镜像树");
        } else {
            System.out.println("非镜像树");
        }
    }
}
