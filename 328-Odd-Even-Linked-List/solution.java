/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode tail = head;
        ListNode temp = head;
        int size = 1;
        int i = 2;
        if (head==null) return null;
        if (head.next==null) return head;
        while (tail.next!=null) {
            tail = tail.next;
            size++;
        }
        head = head.next;
        while (head.next != null) {
            ListNode node = removeNode(head);
            if ((i==2 && size==3) || (i==4 && size==4)) {
                head.next = node;
                break;
            }
            insertTail(node, tail);
            tail = tail.next;
            //i += 2;
            if ((i+=2)>size) break;
            head = head.next;
            
        }
        return temp;
    }
    
    public void insertTail(ListNode node, ListNode tail) {
        tail.next = node;
        node.next = null;
    }
    
    public ListNode removeNode(ListNode node) {
        int tempVal = node.val;
        node.val = node.next.val;
        node.next.val = tempVal;
        ListNode tempNode = node.next;
        node.next = node.next.next;
        return tempNode;
    }
    
    /*public void printList(ListNode head){
        String str = "[";
        while(true) {
            if (head.next==null){
                str += head.val + "]";
                break;
            } else {
                str  += head.val + ",";
                head = head.next;
            }
        }
        System.out.println(str);
    }*/
}