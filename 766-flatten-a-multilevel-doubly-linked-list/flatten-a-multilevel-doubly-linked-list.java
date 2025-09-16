/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;

        Node temp = head;

        while (temp != null) {
            // if no child, move ahead
            if (temp.child == null) {
                temp = temp.next;
                continue;
            }

            // recursive call on child
            Node child = flatten(temp.child);

            // save next pointer
            Node next = temp.next;

            // connect child with temp
            temp.next = child;
            child.prev = temp;
            temp.child = null;

            // find tail of child
            Node tail = child;
            while (tail.next != null) {
                tail = tail.next;
            }

            // connect tail with next (if exists)
            if (next != null) {
                tail.next = next;
                next.prev = tail;
            }

            // move forward
            temp = next;
        }
        return head;

        
    }
}