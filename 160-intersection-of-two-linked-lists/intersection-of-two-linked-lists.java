/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;


        int count1 =0;
        while(temp1 !=null){
            temp1 = temp1.next;
            count1++;
        }
        temp1 = headA;
        int count2 = 0;
        while(temp2 != null){
            temp2 = temp2.next;
            count2++;
        }
        temp2 = headB;
        int count = Math.abs(count1-count2);

        if(count1> count2){
          for(int i =0; i<count ; i++){
            temp1 = temp1.next;
          }
        }else{
             for(int i =0; i<count ; i++){
               temp2 = temp2.next;
            }

        }
        while(temp1!=temp2){
            temp1 =temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}