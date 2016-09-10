public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int index = length-1;

        while (index>=0){
            if (digits[index]==9){
                digits[index] = 0;
            } else break;
            index--;
        }
        if (index>=0) {
            digits[index] +=1;
            return digits;
        } else {
            int[] result = new int[length+1];
            result[0] = 1;
            return result;
        }
    }
}