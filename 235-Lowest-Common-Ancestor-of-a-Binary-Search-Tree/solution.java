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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if ((p.val>=root.val && q.val<=root.val) || (p.val<=root.val && q.val>=root.val)) return root;
        if (p.val<root.val) {
            root = root.left;
            return lowestCommonAncestor(root, p, q);
        } else {
            root = root.right;
            return lowestCommonAncestor(root, p, q);
        }
        //return null;
        
        
        /*TreeNode parentP = findParentNode(root,p);
        TreeNode parentQ = findParentNode(root,q);
        if (parentP==parentQ) return parentP;
        lowestCommonAncestor(root, parentP, parentQ);
        return null;*/
        
    }
    
    
    public TreeNode findParentNode(TreeNode root, TreeNode n) {
        if (n.val>root.val) {
            if (root.right.val!=n.val){
                root = root.right;
                findParentNode(root, n);
            } else return root;
        }
        if (n.val<root.val) {
            if (root.left.val!=n.val) {
                root = root.left;
                findParentNode(root, n);
            } else return root;
        }
        if (n.val==root.val) return root;
        return null;
    }
    
}