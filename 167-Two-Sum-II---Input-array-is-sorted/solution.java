public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*int min = 0;
        int max = numbers.length-1;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]<=target) max = i;
        }
        
        while (numbers[min] + numbers[max] != target) {
            if (numbers[min] + numbers[max] > target) {
                max--;
            } else if (numbers[min] + numbers[max] < target) {
                min++;
            }
        }
        return new int[]{++min, ++max};*/
        int mid = target/2;
        int min = 0;
        int max = numbers.length-1;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i]>=mid) {
                if (numbers[i]==mid) {
                    /*if (i==0) return new int[]{1,2};
                    if (numbers[i]==numbers[i+1]) return new int[]{i+1,i+2};*/
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