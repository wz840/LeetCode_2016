public class Solution {
    public int removeElement(int[] nums, int val) {
		int zm = 0;
		int zp = -1;
        int temp = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==val) {
            	zm++;
            	if (zm==1) zp=i;
            }
            else {
            	if (zp<i && zp>=0) {
            		temp = nums[i];
            		nums[i] = nums[zp];
            		nums[zp] = temp;
            		zp++;
                }                
            }
        }
        return nums.length-zm;
    }
}