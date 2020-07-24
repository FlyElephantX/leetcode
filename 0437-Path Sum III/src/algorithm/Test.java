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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int curCount = isMeetSum(root, sum);
        int leftCount = pathSum(root.left, sum);
        int rightCount = pathSum(root.right, sum);
        return curCount + leftCount + rightCount;
    }

    public int isMeetSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.val == sum) {
            count++;
        }
        return count + isMeetSum(root.left, sum - root.val) + isMeetSum(root.right, sum - root.val);
    }
}

public class Test {

    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(3);
        TreeNode node8 = new TreeNode(-2);
        TreeNode node9 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3, node7, node8);
        TreeNode node5 = new TreeNode(2, null, node9);
        TreeNode node6 = new TreeNode(11);
        TreeNode node2 = new TreeNode(5, node4, node5);
        TreeNode node3 = new TreeNode(-3, null, node6);
        TreeNode node1 = new TreeNode(10, node2, node3);
        Solution solution = new Solution();
        int count = solution.pathSum(node1, 8);
        System.out.println("路径总数:" + count);
    }
}
