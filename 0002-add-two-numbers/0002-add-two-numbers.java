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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //initialise a node for result
    ListNode result = new ListNode(0);
        //initialise current node to result
    ListNode curr = result;
        //initialise a variable for carry
    int carry = 0;

        //traverse l1 and l2 till both null
    while (l1 != null || l2 != null ) {
        
        // Get the values of the current nodes, or 0 if they are null.
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the current digits and the carry.
            int sum = x + y + carry;
        
        // Update the carry for the next iteration.
            carry = sum / 10;

            // Create a new node for the result with the current digit.
            curr.next = new ListNode(sum % 10);
            // Move the current node to the newly created node.
            curr = curr.next;

            // Move to the next nodes in both input lists if they are not null.
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there is a carry after traversing both input lists, create a new node for it.
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        // Return the result linked list starting from the node after the dummy.
        return result.next;
    }
}