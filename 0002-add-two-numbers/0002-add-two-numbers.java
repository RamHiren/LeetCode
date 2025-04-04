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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode t = null;
        int c =0;
        while(l1 != null || l2 != null || c != 0){
            int v1 = (l1==null)?0:l1.val;
            int v2 = (l2==null)?0:l2.val;
            int v = v1 +v2 + c;
            ListNode newNode = new ListNode(v %10);
            c  =  v/10; 

            if(head == null){
                head = newNode;
                t = newNode;
            }else{
                t.next=newNode;
                t=newNode;
            }

            if(l1!= null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            

        }

        return head;
    }
}