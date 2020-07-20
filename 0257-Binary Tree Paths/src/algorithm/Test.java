package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }

class Solution {

    List<String> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        paths.clear();
        if (root != null) {
            binaryTreePath(root, "" + root.val);
        }
        return paths;
    }

    public void binaryTreePath(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            paths.add(path);
        }
        if (root.left != null) {
            binaryTreePath(root.left, path + "->" + root.left.val);
        }
        if (root.right != null) {
            binaryTreePath(root.right, path + "->" + root.right.val);
        }
    }
}

public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        Solution solution = new Solution();
        List<String> list = solution.binaryTreePaths(node1);
        System.out.println("路径:" + Arrays.toString(list.toArray()));
    }
}
