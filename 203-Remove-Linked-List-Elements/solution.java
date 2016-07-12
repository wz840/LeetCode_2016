/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head==null) return null;
        else {
            ListNode n = head;
            if (head.next==null) {
                if (head.val==val) return removeTail(head,head);
                else return head;
            } else {
                while(n.next!=null) {
                    if (n.val==val){
                        removeNode(n);
                    } else n = n.next;
                }
                if (n.val==val) {
                    return removeTail(head,n);
                }
                return head;
            }   
        }
    }
    
    public void removeNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public ListNode removeTail(ListNode head, ListNode tail){
        ListNode n = head;
        if (n.next!=null){
            while(n.next!=tail) {
                n = n.next;
            }
            n.next = null;
            return head;
        } else {
            return null;
        }
    }
}