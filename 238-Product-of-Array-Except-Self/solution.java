public class Solution {
    private int zeroCounter = 0;
    private int zeroIndex = -1;
    
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] product = new int[2];
        calProduct(nums, product);
        int[] output = new int[N];
        
        if (zeroCounter<2) {
            for (int i=0; i<N; i++) {
                if (zeroCounter==1) {
                    if (i==zeroIndex) output[i] = product[1];
                    else output[i] = 0;
                } else output[i] = product[0] / nums[i];
            }
        }
        return output;
    }
    
    public void calProduct(int[] nums, int[] product) {
        product[0] = 1;
        product[1] = 1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==0) {
                product[0] = 0;
                zeroCounter++;
                zeroIndex = i;
                break;
            } else product[0] = product[0] * nums[i];
        }
        if (zeroCounter==1) {
            for (int i=0; i<zeroIndex; i++) {
                product[1] = product[1]*nums[i];
            }
            for (int i=zeroIndex+1; i<nums.length; i++) {
                product[1] = product[1]*nums[i];
            }
        }
    }
}