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
    private List<Integer> ls1 = new ArrayList<Integer>();
    private List<Integer> ls2 = new ArrayList<Integer>();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p!=null && q!=null){
            ls1.add(p.val);
            ls2.add(q.val);
            dfs(p, ls1);
            //int[] pArr = listToArray(ls1);
            dfs(q, ls2);
            //int[] qArr = listToArray(ls2);
           // System.out.println(Arrays.toString(pArr));
           // System.out.println(Arrays.toString(qArr));

            
            return ls1.equals(ls2);
        } else if (p==null && q==null) return true;
        else return false;
        
        
        
    }
    
    
    public void dfs(TreeNode p, List<Integer> ls) {
        if (p.left!=null || p.right!=null){
            if (p.left!=null) ls.add(p.left.val);
            else ls.add(null);
            if (p.right!=null) ls.add(p.right.val);
            else ls.add(null);
        }
        if (p.left!=null) {
            dfs(p.left, ls);
        }
        if (p.right!=null) {
            dfs(p.right, ls);
        }
    }
    
    public int[] listToArray(List<Integer> ls) {
        int[] arr = new int[ls.size()];
        for (int i=0; i<ls.size(); i++) {
            arr[i] = ls.get(i).intValue();
        }
        return arr;
    }
}