/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private List<Integer> ls = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        preorderTraversal(root);
        int min = ls.get(k-1).intValue();
        return min;
    }
    
    public void preorderTraversal(TreeNode root) {
        if (root.left!=null) preorderTraversal(root.left);
        ls.add(root.val);
        if (root.right!=null) preorderTraversal(root.right);
    }
}