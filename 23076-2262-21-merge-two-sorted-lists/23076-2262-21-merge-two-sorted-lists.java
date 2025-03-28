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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode head = sortedList;

        while(list1 !=null && list2 !=null){
            if(list1.val<=list2.val){
                sortedList.next = list1;
                list1 = list1.next;
                sortedList = sortedList.next;
            }else{
                sortedList.next = list2;
                list2 = list2.next;
                sortedList = sortedList.next;
            }
        }

        while(list1 != null){
            sortedList.next = list1;
            list1 = list1.next;
            sortedList = sortedList.next;
        }
        while(list2 != null){
            sortedList.next = list2;
            list2 = list2.next;
            sortedList = sortedList.next;
        }

        return head.next;
    }
}