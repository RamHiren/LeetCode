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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return head.next;

       int size = 1;

       ListNode sz = head;

       while(sz.next != null){
        sz = sz.next;
        size++;
       }

       n = size-n;

       ListNode c =head;
       ListNode p = null;

       while(n>0){
        p = c;
        c=c.next;
        n--;
       }

        if(p==null){
            return c.next;
        }else{
            p.next = c.next;
        }
       


        return head;
    }
}