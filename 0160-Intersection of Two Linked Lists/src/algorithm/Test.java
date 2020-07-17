package algorithm;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int len1 = getListLength(headA);
        int len2 = getListLength(headB);
        int num = Math.abs(len1 - len2);
        if (len1 > len2) {
            for (int i = 0;i < num;i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0;i < num;i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int getListLength(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}

public class Test {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = node3;
        Solution solution = new Solution();
        ListNode res = solution.getIntersectionNode(node1, n1);
        while (res != null) {
            System.out.println("节点值:" + res.val);
            res = res.next;
        }
    }
}
