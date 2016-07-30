public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] counts = new int[target+1];
        counts[0] = 1;
        for (int i=1; i<=target; i++) {
            for (int n:nums) {
                if (n<=i){
                    counts[i] += counts[i-n];
                }
            }
        }
        return counts[target];
    }
}