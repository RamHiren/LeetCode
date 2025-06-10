/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0); 
        dummy.next = head;

        ListNode p = dummy;
        ListNode c= head;

        while (c != null && c.next != null) {
            int f = 0;
            while (c.next != null && c.val == c.next.val) {
                f = 1;
                c = c.next;
            }

            if (f == 1) {
                c = c.next;      
                p.next = c;       
            } else {
                p = c;
                c = c.next;
            }
        }

        return dummy.next;
    }
}