package algorithm;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}

public class Test {

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        Solution solution = new Solution();
        ListNode node = solution.reverseList(node1);
        while (node != null) {
            System.out.println("节点值:" + node.val);
            node = node.next;
        }
    }
}
