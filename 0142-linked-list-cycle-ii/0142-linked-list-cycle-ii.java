/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;
        boolean start = true;
        
        while(start || hare!=turtle)
        {
            if(hare==null || hare.next==null)
            {
                return null;
            }
            hare = hare.next.next;
            turtle = turtle.next;
            start = false;
        }
        while(head!=hare)
        {
            head = head.next;
            hare = hare.next;
        }
        return head;
    }
}