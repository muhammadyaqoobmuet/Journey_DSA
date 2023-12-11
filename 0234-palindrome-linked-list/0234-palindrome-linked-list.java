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
    
    public static ListNode getMiddleOfNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // here slow is the middle of Linked list
        // this is turtle or you can say slow-fast approach or two-pointer approach
    }
    
    public boolean isPalindrome(ListNode head) {
        // edge cases
        if (head == null || head.next == null) {
            return true;
        }
        
        // reversing array to iterate from end
        ListNode curr = getMiddleOfNode(head);
        ListNode next;
        ListNode prev = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // checking left right
        ListNode right = prev;
        ListNode left = head;
        
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            
            right = right.next;
            left = left.next;
        }
        
        return true;
    }
}
