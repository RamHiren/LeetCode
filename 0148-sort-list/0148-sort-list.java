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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode tail = head;
        ListNode t = head.next;

        while(t != null){
            if(t.val >= tail.val){
                tail = t;
                t=t.next;
                continue;
            }

            ListNode p = null;
            ListNode c =head;
            tail.next = t.next;

            while(c != tail.next){
                if(c.val>=t.val){
                    break;
                }
                p = c;
                c = c.next;
            }

            if(p==null){
                t.next = head;
                head = t;
            }else{
                p.next = t;
                t.next = c; 
            }

            t = tail.next;
        }

        return head;
    }
}