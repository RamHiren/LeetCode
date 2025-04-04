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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        int c =0;
        ListNode t=head;
        while(t.next != null){
            c++;
            t=t.next;
        } 
        c++;

        ListNode m = head;
        ListNode p = null;
        int x = 0;

        while(x<(c/2)){
            p=m;
            m=m.next;
            x++;
        }

        p.next = m.next;

        return head;
    }
}