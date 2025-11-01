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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: put all nums in a set
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        // Step 2: create dummy node for easy handling of head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 3: use a pointer to rebuild the list
        ListNode curr = dummy;
        while (curr.next != null) {
            if (set.contains(curr.next.val)) {
                // skip node
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        // Step 4: return new head
        return dummy.next;
        
    }
}