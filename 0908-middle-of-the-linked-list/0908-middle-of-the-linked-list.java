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
    public ListNode middleNode(ListNode head) {
        int c =1;
        ListNode t = head;
        while(t.next != null){
            c++;
            t = t.next;
        }
       
        System.out.println(c);
        ListNode ans = head;
        int p = 0;
        while(p<(c/2)){
            p++;
            ans = ans.next;
        }


        return ans;
    }
}