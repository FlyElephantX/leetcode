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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == q) {
                return true;
            } else {
                return false;
            }
        }
        boolean isSameLeft = isSameTree(p.left, q.left);
        boolean isSameRight = isSameTree(p.right, q.right);
        return  p.val == q.val && isSameLeft && isSameRight;
    }
}

public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
//        node1.right = node2;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left = n2;
        n1.right = n3;

        Solution solution = new Solution();
        boolean res = solution.isSameTree(node1, n1);
        if (res) {
            System.out.println("相同的树");
        } else {
            System.out.println("不同的树");
        }
    }
}
