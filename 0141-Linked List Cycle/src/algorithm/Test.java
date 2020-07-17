package algorithm;

import java.awt.print.Pageable;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

 class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;
        while (node1 != null && node2 != null) {
            if (node1 == node2) {
                return true;
            }
            node1 = node1.next;
            if (node2.next == null) {
                return false;
            }
            node2 = node2.next.next;
        }
        return false;
    }
}

public class Test {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        Solution solution = new Solution();
        boolean isCycle = solution.hasCycle(node1);
        if (isCycle) {
            System.out.println("链表存在环路");
        } else {
            System.out.println("链表不存在环路");
        }
    }
}
