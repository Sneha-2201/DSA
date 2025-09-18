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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null )return head;
        ListNode dummy = new ListNode(-1);
        ListNode temp =head;
        while(temp!=null){
            int key = temp.val;
            ListNode nextnode = temp.next ;
            ListNode j = dummy;
            while(j.next!=null && j.next.val<key){
                j = j.next;
            }
            temp.next = j.next;
            j.next = temp;

            temp = nextnode;

        }
        return dummy.next;
         
        
        
         

        
        
    }
}