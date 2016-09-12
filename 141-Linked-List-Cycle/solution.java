/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(head!=null) {
            int sizeBefore = set.size();
            set.add(head);
            int sizeAfter = set.size();
            if (sizeBefore==sizeAfter) return true;
            head = head.next;
        }
        return false;
    }
}