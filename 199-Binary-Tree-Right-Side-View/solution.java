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
    
    private int depth = 0;
    List<Integer> ls = new ArrayList<Integer>();
    
    public List<Integer> rightSideView(TreeNode root) {
       
        if (root==null) return ls;
        if (ls.size()==depth) ls.add(root.val);
        if (childStatus(root)!="NONE") depth++;
        
        if (childStatus(root)=="BOTH") {
            int localDepth = depth;
            System.out.println("localDepth    " + localDepth);

            TreeNode node = root.right;
            rightSideView(node);
            System.out.println("right depth    " + depth);
            
            depth = localDepth;
            System.out.println("left depth    " + depth);

            node = root.left;
            rightSideView(node);
        }
        
        if (childStatus(root)=="RIGHT") {
            TreeNode node = root.right;
            rightSideView(node);
        }
        
        if (childStatus(root)=="LEFT") {
            TreeNode node = root.left;
            rightSideView(node);
        }
        
        return ls;

        
    }
        
        
        
    
    
    public String childStatus(TreeNode root) {
        if (root.left!=null && root.right!=null) return "BOTH";
        if (root.left!=null && root.right==null) return "LEFT";
        if (root.left==null && root.right!=null) return "RIGHT";
        else return "NONE";
    }
}