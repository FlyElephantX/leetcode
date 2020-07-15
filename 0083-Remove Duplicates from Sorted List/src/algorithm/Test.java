package algorithm;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null) {
           return null;
       }
       ListNode node = head;
       ListNode res = head;
       while (node != null) {
           while (node.next != null && node.val == node.next.val) {
               node = node.next;
           }
           node = node.next;
           head.next = node;
           head = head.next;
       }
       return res;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = solution.deleteDuplicates(node1);
        while (res != null) {
            System.out.println("节点结果:" + res.val);
            res = res.next;
        }

    }
}
