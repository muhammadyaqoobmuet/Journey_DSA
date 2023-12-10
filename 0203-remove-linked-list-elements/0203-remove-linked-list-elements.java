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
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head itself needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                // Remove the node by bypassing it
                curr.next = curr.next.next;
            } else {
                // Move to the next node
                curr = curr.next;
            }
        }

        return head;
    }
}
