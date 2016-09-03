public class Solution {
    public int findMin(int[] nums) {
        /*if (nums.length==1) return nums[0];
        int diff = 0;
        int index = 0;
        
        for (int i=0; i<nums.length; i++) {
            diff = nums[i] - nums[nums.length-1-i];
            if (diff<=0) {
                index = nums.length-i-1;
                break;
            }
        }
        if (nums.length%2!=0 && index==nums.length/2) {
            if (nums[index]<=nums[index+1] && nums[index]<=nums[index-1]) return nums[index];
            else return nums[index+1];
        } else {
            return nums[(index+1)%nums.length];
        }*/
        int min = nums[0];
        int temp = 0;
        for (int i=0; i<nums.length/2; i++) {
            temp = (nums[i]<=nums[nums.length-1-i])?nums[i]:nums[nums.length-1-i];
            min = (min<=temp)?min:temp;
        }
        min = min<=nums[nums.length/2]?min:nums[nums.length/2];
        return min;
    }
}