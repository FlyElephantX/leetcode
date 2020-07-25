package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    Integer preV = null;
    int max = 0;
    int count = 1;
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        traverse(root.left, list);
        if (preV != null) {
            if (root.val == preV) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count > max) {
            list.clear();
            max = Math.max(count, max);
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        preV = root.val;
        traverse(root.right, list);
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        int[] res = solution.findMode(node1);
        System.out.println("众数:" + Arrays.toString(res));
    }
}
