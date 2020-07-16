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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBSTNode(nums, 0 , nums.length - 1);
    }

    public TreeNode createBSTNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBSTNode(nums, start, mid - 1);
        node.right = createBSTNode(nums, mid + 1, end);
        return node;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = solution.sortedArrayToBST(nums);
        System.out.println("顶部节点:" + node.val);
    }
}
