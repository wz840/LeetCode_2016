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
            if (isOnlyTail(n,head)) {
                return removeOnlyTail(n,val);
            } else {
                while(n.next!=null) {
                    // System.out.println("head: " + head.val);
                    // System.out.println("n: " + n.val);
                    if (n.val==val){
                        if (n.next.next!=null) {
                            n.val = n.next.val;
                            n.next = n.next.next;
                        } else {
                            n.val = n.next.val;
                            n.next = null;
                        }
                    } else {
                        n = n.next;
                    }
                }
                //System.out.println(n.val);
                //System.out.println("head.next: " + head.next.val);

                if (n.val==val) {
                    return removeTail(head,n,val);
                }
                // System.out.println(head.next==null);
                // System.out.println(n==null);
                return head;
            }   
        }
    }
    
    public void removeNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public boolean isOnlyTail(ListNode node, ListNode head) {
        return (node.next==null && node==head);
    }
    
    public boolean isTail(ListNode node) {
        return (node.next==null);
    }
    
    public ListNode removeOnlyTail(ListNode tail, int val) {
        if (tail.val!=val) return tail;
        else return null;
    }
    
    public void lastSecondNode(ListNode n, int val, ListNode head) {
        if (!isTail(n)){
            if (n.next.next==null && n.next.val==val) {
                n.next = null;
            } else {
                return;
            }
        } else removeNode(n);
    }
    
    
    public ListNode removeTail(ListNode head, ListNode tail, int val){
        ListNode n = head;
        if (n.next!=null){
            while(n.next!=tail){
                n = n.next;
            }
            n.next = null;
            return head;
        } else {
            return removeOnlyTail(tail,val);
        }
    }
}