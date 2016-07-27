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
    List<Integer> nodeList = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root!=null) nodeList.add(root.val);
        else return nodeList;
        if (root.left != null) preorderTraversal(root.left);
        if (root.right != null) preorderTraversal(root.right);
        return nodeList;
        
    }
}