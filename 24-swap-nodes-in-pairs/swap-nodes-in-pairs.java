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
    public ListNode swapPairs(ListNode head) {
        if(head ==null)return null;
        if(head.next==null)return head;
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
         dummy.next = head;
        ListNode prev = dummy ;

        
    
        while(curr!= null&&curr.next!=null){

            ListNode first = curr;
            ListNode second = curr.next;
            ListNode nextpair = second.next;

            second.next = first;
            first.next = nextpair;
            prev.next = second ;

            prev = first;
            curr = nextpair;

        }
        return dummy.next;

        
    }
}