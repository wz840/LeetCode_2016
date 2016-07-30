public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Set<Integer> hs = new HashSet<Integer>();
        for (int i=0; i<size; i++) {
            hs. add(nums[i]);
        }
        return !(hs.size()==size);
        
    }
}