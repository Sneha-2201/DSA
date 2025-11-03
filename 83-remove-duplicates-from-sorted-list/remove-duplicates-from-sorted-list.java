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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null|| head.next==null)return head;
        ListNode t = head, t1 = head.next;
        while(t1!=null){
            while(t1!=null && t.val==t1.val){
            
                t1=t1.next;
            }
            t.next = t1;
            t= t.next;
            if(t1!=null)t1=t1.next;


        }
        return head;
        
    }
}