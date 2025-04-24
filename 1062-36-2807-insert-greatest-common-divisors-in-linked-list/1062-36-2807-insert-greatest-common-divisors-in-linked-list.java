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
    public int findGCD(int a,int b){
        while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
        }
       return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode node1 = head;
        ListNode node2 = head.next;
        while(node2!=null){
            int gcd = findGCD(node1.val,node2.val);
            ListNode newNode = new ListNode();
            newNode.val = gcd;

            node1.next = newNode;
            newNode.next = node2;

            node1 = node2;
            node2 = node2.next;
        }

        return head;
    }
}