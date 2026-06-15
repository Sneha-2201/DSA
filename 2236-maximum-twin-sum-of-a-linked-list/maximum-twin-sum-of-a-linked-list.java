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
    public int pairSum(ListNode head) {
        ListNode slow = head ;
         ListNode fast = head ;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        int max =Integer.MIN_VALUE ;
        ListNode agla =null;
        ListNode prev = null;
        ListNode curr = slow;
        while(agla!=null|| curr!=null){
           agla = curr.next;
           curr.next = prev ;
           prev = curr;
           curr = agla;
           
        }
        ListNode temp1 = head;
        ListNode temp2 = prev;
        while(temp2!=null){
             int sum = temp1.val + temp2.val;
             if(sum>max){
                max = sum;
             }
             temp1 = temp1.next ;
             temp2 = temp2.next;
        }

        return max;
    }
}