package algorithm;

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
 }


class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class Test {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        Solution solution = new Solution();
        solution.deleteNode(node2);
        while (node1 != null) {
            System.out.println("节点的值:" + node1.val);
            node1 = node1.next;
        }
    }
}
