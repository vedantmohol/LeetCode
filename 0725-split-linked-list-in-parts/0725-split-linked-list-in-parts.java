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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp= head;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }

        ListNode result[] = new ListNode[k];
        temp = head;
        int avg = size/k;
        int extra = size%k;
        for(int i=0 ; i<k ; i++)
        {
            if(temp==null)
            {
                break;
            }
            ListNode currHead = temp;
            ListNode prev = null;
            int length = 0;
            while(temp!=null && length<avg)
            {
                prev = temp;
                temp = temp.next;
                length++;
            }
            if(extra>0)
            {
                prev = temp;
                temp = temp.next;
                extra--;
            }
            prev.next = null;
            result[i] = currHead;
        }
        return result;
    }
}