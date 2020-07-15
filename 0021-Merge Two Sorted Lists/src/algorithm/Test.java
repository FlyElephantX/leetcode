package algorithm;

import java.awt.print.Pageable;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode node = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    head = l1;
                    node = head;
                } else {
                    node.next = l1;
                    node = node.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    node = head;
                } else {
                    node.next = l2;
                    node = node.next;
                }
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            node.next = l1;
        }
        if (l2 != null) {
            node.next = l2;
        }
        return head;
    }
}
public class Test {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;
        Solution solution = new Solution();
        ListNode node = solution.mergeTwoLists(l11, l21);
        while (node != null) {
            System.out.println("节点:" + node.val);
            node = node.next;
        }
    }
}
