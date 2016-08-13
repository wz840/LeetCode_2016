/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head==null) return null;
        if (head.next==null) return head;
        ListNode sentinel = head;
        while (sentinel.next!=null) {
            if (sentinel.val==sentinel.next.val) {
                if (remove(sentinel.next)==null) {
                    sentinel.next=null;
                    break;
                }
            } else {
                if (sentinel.next!=null) sentinel = sentinel.next;
                else break;
            }
        }
        return head;
    }
    
    public ListNode remove(ListNode head) {
        if (head.next!=null) {
            head.val = head.next.val;
            head.next = head.next.next;
            return head;
        }
        return null;
    }
}