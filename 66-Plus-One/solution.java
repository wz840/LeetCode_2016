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
    
        
        
        
        
        
        /*int length = digits.length;
        int sum = sumArray(digits);
        if (sum==length*9) {
            int [] result = new int[length+1];
            result[0] = 1;
            return result;
        } else {
            digits[length-1] += 1;
            return digits;
        }*/
    }
    
    /*public int sumArray(int[] array) {
        int num = 0;
        for (int i=0; i<array.length; i++) {
            num += array[i];
        }
        return num;
    }*/
}