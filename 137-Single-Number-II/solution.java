public class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i=0; i<32; i++) {
            int bits = 0;
            for (int j=0; j<nums.length; j++) {
                bits += (nums[j] >> i) & 1;
                
            }
            num = num | (bits%3 << i);
            
        }
        return num;
    }
}