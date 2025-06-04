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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode f = head;
        ListNode s = head.next;
        ListNode p = null;

        while (f != null && s != null) {
            ListNode t = s.next;
            s.next = f;
            f.next = t;
            if(p!= null){
                p.next=s;
            }else{
                head = s;
            }

            p = f;
            f = t;

            if(t != null){
                s = t.next;
            }else{
                s=null;
            }
        }

        return head;
    }
}