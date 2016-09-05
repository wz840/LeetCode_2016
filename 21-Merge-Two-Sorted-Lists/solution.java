/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1==null && l2!=null) return l2;
        if (l1!=null && l2==null) return l1;
        if (l1==null && l2==null) return null;
        
        /*List<ListNode> ls = new ArrayList<ListNode>();
        while (l1!=null && l2!=null) {
            if (l1.val<=l2.val) {
                ls.add(l1);
                l1 = l1.next;
            } else {
                ls.add(l2);
                l2 = l2.next;
            }
        }
        
        ListNode first = new ListNode((ls.get(0)).val);
        ls.remove(ls.get(0));
        ListNode head = first;
        for (ListNode node: ls) {
                head.next = node;
                head = node;
        }
        
        if (l1==null) head.next = l2;
        else head.next = l1;
        
        return first;*/
        ListNode head = null;
        if (l1.val<=l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode first = head;
        
        while (l1!=null && l2!=null) {
            if (l1.val<=l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        

        if (l1==null) head.next = l2;
        else head.next = l1;
        
        return first;
        
        
        
        
    }
}