package algorithm;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i <= list.size() / 2; i++) {
            int end = list.get(list.size() - 1 - i);
            if (list.get(i) != end) {
                return false;
            }
        }
        return true;
    }
}

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        boolean res = solution.isPalindrome(node1);
        System.out.println("回文链表结果:" + res);
    }
}
