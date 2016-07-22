/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        else {
            Stack<Integer> st = new Stack<Integer>();
            ListNode temp = new ListNode(0);
            temp = head;
            while (head!=null) {
                st.push(head.val);
                head = head.next;
            }
            head = temp;
            while (!st.empty()) {
                head.val = st.pop();
                head = head.next;
            }
            return temp;
        }
    }
}