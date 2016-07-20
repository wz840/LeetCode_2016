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
    Stack<TreeNode> st = new Stack<TreeNode>();
    

    public List<Integer> inorderTraversal(TreeNode root) {
        /*while (root.left!=null) {
            inorderTraversal(root.left);        
        }
        nodeList.add(root.val);
        while (root.right!=null) {
            inorderTraversal(root.right);
        }
        return nodeList;*/
        
        
        if (root!=null) {
            st.push(root);
            if (root.left!=null) {
                inorderTraversal(root.left);
            } 
            nodeList.add(st.pop().val);
            if (root.right!=null) inorderTraversal(root.right);
        }
        
        
        return nodeList;
        
        
        /*traversalSubTree(root.left);
        nodeList.add(root.val);
        traversalRightTree(root);*/
    }
    
    /*public void traversalSubTree(TreeNode root) {
        if (root.left!=null) {
            st.push(root);
            traversalSubTree(root.left);
        } else {
            nodeList.add(root.val);
        }
        if (root.right!=null) traversalSubTree(root.right);
    }*/
    
    
    
}