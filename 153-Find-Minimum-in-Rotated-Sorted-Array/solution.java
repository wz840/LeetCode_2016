public class Solution {
    public int findMin(int[] nums) {
        
        if (nums.length==1) return nums[0];
        int diff = 0;
        int index1 = 0;
        int index2 = 0;
        
        for (int i=0; i<nums.length; i++) {
            diff = nums[i] - nums[nums.length-1-i];
            if (diff<=0) {
                index1 = i;
                index2 = nums.length-i-1;
                break;
            }
        }
        if (nums.length%2!=0 && index1==nums.length/2) {
            if (nums[index1]<=nums[index1+1] && nums[index1]<=nums[index1-1]) return nums[index1];
            else {
                int index = (nums[index1]<nums[(index2+1)%nums.length])?index1:((index2+1)%nums.length);
                return nums[index];
            }
        } else {
            int index = (nums[index1]<nums[(index2+1)%nums.length])?index1:((index2+1)%nums.length);
            return nums[index];
        }

        
        
        /*int min = nums[0];
        int temp = 0;
        for (int i=0; i<nums.length/2; i++) {
            temp = (nums[i]<=nums[nums.length-1-i])?nums[i]:nums[nums.length-1-i];
            min = (min<=temp)?min:temp;
        }
        min = min<=nums[nums.length/2]?min:nums[nums.length/2];
        return min;*/
    }
}