/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null) return null;
        if (head.next==null) return head;
       
        ListNode swap = new ListNode(head.next.val);
        ListNode deleted = head.next;
        swap.next = head;
        
        head.next = swapPairs(head.next.next);
        head = swap;
        deleted.next = null;
    
        
        return head;
        
    }
}