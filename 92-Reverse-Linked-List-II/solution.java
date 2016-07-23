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

        if (head==null) return null;        //empty list
        else if (head.next==null) {         // only one node in list
            return head;
        }
        else {                              // Multiple nodes in list
            if (m==n) return head;          // reverse nothing
            else if (m==1) {                // reverse from the start, make a dummy node as pointer
                pointer = new ListNode(0);
                pointer.next = head;
            } else {                        // traverse the list until we meet the starting node
                while (i<m) {
                    i++;
                    if (i==m) pointer = head;       // mark the node before the starting node as pointer
                    head = head.next;
                }
            }
            pivot = head;                           // mark the first node for reverse as the pivot
            head = head.next;                       // pivot never get swapped
            for (int j=i+1; j<=n; j++) {             
                System.out.println(head.val);
                deleteNode(pivot, head);            // detach the node right next to pivot
                insertAfter(pointer, head);         // swap it (insert) after the pointer
                if (m==1) temp = head;              // if m==1 make the return node as the swapped node   
                head = pivot.next;                  // because it's a moving head of the list to be returned.
            }
            return temp;
        }
    }
    
    public void deleteNode(ListNode pivot, ListNode node) {             // delete the node from the list, but not set to null
        pivot.next = node.next;
    }
    
    public void insertAfter(ListNode pointer, ListNode node) {          // insert the deleted node after the pointer
        node.next = pointer.next;
        pointer.next = node;
    }
    
    
    
}