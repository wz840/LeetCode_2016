public class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = nums.length/2;
        if (nums.length==0) return 0;
        if (target==nums[mid]) return mid;
        if (nums.length==1) {
            if (target>nums[0]) return 1;
            else return 0;
        }
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid+1, nums.length);
        
        if (target>nums[mid]) {
            return searchInsert(right, target) + mid + 1;
        } else {
            return searchInsert(left, target);
        }
        
        
        
    }
}