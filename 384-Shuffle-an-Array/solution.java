public class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] s = Arrays.copyOf(nums, nums.length);
        Set<Integer> hs = new HashSet<Integer>();
        Random rd = new Random();
        for (int i=0; i<s.length; i++) {
            int n = rd.nextInt(s.length);
            while(hs.contains(n)){
                n = rd.nextInt(s.length);
            }
            s[i] = nums[n];
            hs.add(n);
        }
        return s;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */