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


//recursively

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        reverse(head,fakeHead);
        return fakeHead.next;
    }
    
    private ListNode reverse(ListNode node , ListNode fakeHead){
        if( node == null){
            return fakeHead;
        }
        
        else{
            ListNode tail = reverse(node.next, fakeHead);
            tail.next = node;
            node.next= null;
            return node;
        }
    }
}