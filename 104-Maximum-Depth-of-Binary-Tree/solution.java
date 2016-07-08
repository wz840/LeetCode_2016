/**
 * Definition for a binary tree node.
  **/
 


public class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        else {
            int leftDepth = 0;
            int rightDepth = 0;
            int counter = 0;
            counter++;
            if (root.left!=null) {
                leftDepth = maxDepth(root.left);
            }
            if (root.right!=null) {
                rightDepth = maxDepth(root.right);
            }
            return counter + Math.max(leftDepth, rightDepth);
        }
    }
}