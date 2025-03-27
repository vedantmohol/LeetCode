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
        if(head == null || head.next == null){
            return head;
        }

        ListNode idx1 = head;
        ListNode idx2 = head;

        while(idx2!=null && idx2.next != null){
            idx1 = idx1.next;
            idx2 = idx2.next.next;
        }
        
        return idx1;
    }
}