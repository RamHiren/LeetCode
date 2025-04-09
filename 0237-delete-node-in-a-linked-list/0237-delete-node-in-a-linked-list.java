/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode t = node.next;
        while(t != null){
            node.val =  t.val;
            if(t.next == null){
                node.next = null;
                break;
            }
            node =t;
            t = t.next;

        }
    }
}