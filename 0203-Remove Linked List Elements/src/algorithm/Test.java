package algorithm;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.next == null && head.val == val) {
            return null;
        }
        ListNode first = head;
        while (first != null && first.val == val) {
            first = first.next;
        }
        if (first == null) {
            return null;
        }
        ListNode pre = first;
        ListNode node = first.next;
        while (node != null) {
            if (node.val == val) {
                pre.next = node.next;
            } else {
                pre = pre.next;
            }
            node = node.next;
        }
        return first;
    }
}

public class Test {

    public static void main(String[] args) {
        ListNode node6 = new ListNode(6, null);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node31 = new ListNode(6, node3);
        ListNode node2 = new ListNode(2, null);
        ListNode node1 = new ListNode(1, node2);
        Solution solution = new Solution();
        ListNode res = solution.removeElements(node1, 1);
        while (res != null) {
            System.out.println("链表的值:" + res.val);
            res = res.next;
        }
    }
}
