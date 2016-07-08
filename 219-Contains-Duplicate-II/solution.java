public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer> numList = new ArrayList<Integer>();
        for (int x: nums) {
            numList.add(x);
        }
        Set<Integer> numSet = new HashSet<Integer>();
        numSet.addAll(numList);
        if (numSet.size()==numList.size()) return false;
        else {
            if (k>nums.length-1) k = nums.length-1;
            for (int i=0; i<nums.length; i++) {
                if (i>nums.length-1-k) {
                    k = nums.length-1-i;
                }
                for (int j=i+1; j<i+k+1; j++) {
                    if (nums[i]==nums[j]) return true;
                }
            }
        }
        return false;
    }
}