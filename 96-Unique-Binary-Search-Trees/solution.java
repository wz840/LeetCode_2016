public class Solution {
    private int[] counts;
    public int numTrees(int n) {
        counts = new int[n+1];
        counts[0] = 1;
        counts[1] = 1;
        return num(n);
    }
    
    public int num(int n) {
        if (counts[n]!=0) return counts[n];
        for (int i=1; i<=n; i++) {
            counts[n] += counts[i-1] * num(n-i);
        }
        return counts[n];
    }
}