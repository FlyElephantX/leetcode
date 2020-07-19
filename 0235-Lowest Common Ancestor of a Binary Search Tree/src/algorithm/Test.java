package algorithm;


class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);
        if (root.val > max) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < min) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(0);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(9);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        TreeNode node = solution.lowestCommonAncestor(node1, node2, node5);
        System.out.println("公共父节点的值:" + node.val);
    }
}
