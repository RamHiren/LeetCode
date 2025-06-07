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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next ==null)return head;

        ListNode t = head.next;
        ListNode tail = head;

        while(t!=null){
            if(t.val >= tail.val){
                tail = t;
                t = t.next;
                continue;
            }

            ListNode p = null;
            ListNode c = head;
            tail.next = t.next;
            while(c != tail.next){
                if(c.val >= t.val){
                    break;
                }
                p = c;
                c = c.next;
            }

            if(p == null){
                p = t;
                p.next = head;
                head = p;
            }else{
                p.next = t;
                t.next = c;

            }

            t = tail.next;
        }
        return head;
    }
}