/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 1;
        ListNode temp = head;
        ListNode pointer = null;
        ListNode pivot = null;

        if (head==null) return null;
        else if (head.next==null) {
            return head;
        }
        else {
            if (m==n) return head;
            else if (m==1) {
                pointer = new ListNode(0);
                pointer.next = head;
            } else {
                while (i<m) {
                    i++;
                    if (i==m) pointer = head;
                    head = head.next;
                }
            }
            pivot = head;
            head = head.next;
            for (int j=i+1; j<=n; j++) {
                System.out.println(head.val);
                deleteNode(pivot, head);
                insertAfter(pointer, head);
                if (m==1) temp = head;
                head = pivot.next;
            }
            return temp;
        }
    }
    
    public void deleteNode(ListNode pivot, ListNode node) {
        /*if (node.next!=null) {
            pivot.next = node.next;
        } else {
            pivot.next = null;
        }  */
        pivot.next = node.next;
    }
    
    public void insertAfter(ListNode pointer, ListNode node) {
        node.next = pointer.next;
        pointer.next = node;
    }
    
    
    
}