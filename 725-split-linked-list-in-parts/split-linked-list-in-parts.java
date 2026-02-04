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
        int n =0;
        ListNode curr=head;
        while(curr != null){
            n++;
            curr =curr.next;
        }
        int Basesize =n/k;
        int extra = n%k;

        ListNode [] result = new ListNode[k];
        curr = head;

        for(int i =0; i<k;i++){
            result[i]=curr;
            int currentPartSize = Basesize +(i<extra? 1:0 );
              
            for(int j=0; j<currentPartSize-1 ;j++){
                if(curr!=null)curr =curr.next;
            }
            if (curr != null) {
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }


        }
         return result;
        
    }
}