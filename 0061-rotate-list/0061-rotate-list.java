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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)return head;

        int s = 0;
        ListNode s1 = head;

        while(s1!=null){
            s1=s1.next;
            s++;
        }

        k = k%s;

        while(k-->0){
            ListNode f = head;
            ListNode c = head;
            ListNode p = null;

            while(c.next != null){
                p = c;
                c=c.next;
            }

            c.next  = f;
            head = c;
            p.next = null;
        }
        return head;
    }
}