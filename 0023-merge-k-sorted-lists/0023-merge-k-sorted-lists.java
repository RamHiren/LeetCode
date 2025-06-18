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
    public ListNode mergeKLists(ListNode[] a) {
        ListNode head =null;
        ListNode c = null;

        for(int i=0;i<a.length;i++){
            ListNode current = a[i];
            while (current != null) {
                head = insertNode(current.val, head);
                current = current.next;
            }
        }
        return head;
    }

    public ListNode insertNode(int v,ListNode head){
        if(head==null){
            ListNode t = new ListNode(v);
            head = t;
            return head;
        }
        
        // ListNode tail = head;
        // while(tail != null) tail = tail.next;

        ListNode n = new ListNode(v);

        // if(tail.val >=n.val){
        //     tail.next = n;
        //     return head;
        // }

        ListNode p = null;
        ListNode c =head;

        while(c != null){
            if(c.val>=n.val){
                break;
            }
            p = c;
            c = c.next;
        }

        if(p == null){
            p = n;
            p.next = head;
            head = p;
        }else{
            p.next = n;
            n.next = c;
        }

        return head;


    }
}