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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        Deque<Integer> stack = new ArrayDeque<>();
        ListNode current = head;

        // First pass: push all values onto the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Second pass: compare node values against stack
        current = head;
        while (current != null) {
            if (current.val != stack.pop()) {
                return false;
            }
            current = current.next;
        }

        return true;

        
    }
}