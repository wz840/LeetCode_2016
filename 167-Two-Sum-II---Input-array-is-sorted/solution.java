public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int mid = target/2;
        int min = 0;
        int max = numbers.length-1;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]>=mid) {
                if (numbers[i]==mid) {
                    min = i;
                    max = i+1;
                }
                else if (numbers[i]>mid) {
                    min = i-1;
                    max = i;
                }
                while (numbers[min] + numbers[max] != target) {
                    if (numbers[min] + numbers[max] > target) {
                        min--;
                    } else if (numbers[min] + numbers[max] < target) {
                        max++;
                    }
                }
                return new int[]{min+1, max+1};
            }
        }
        return null;
        
        
        
        
    }
}