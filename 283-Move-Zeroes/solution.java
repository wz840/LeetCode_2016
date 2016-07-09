public class Solution {
    public static void moveZeroes(int[] nums) {
		int zm = 0;
		int zp = -1;
        int temp = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==0) {
            	zm++;
            	if (zm==1) zp=i;
            }
            else {
            	if (zp<i && zp>=0){
            		temp = nums[i];
            		nums[i] = nums[zp];
            		nums[zp] = temp;
            		zp++;
                }                
            }
            //System.out.println(Arrays.toString(nums));
        }        
    }
}