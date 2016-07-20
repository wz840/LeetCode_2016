public class Solution {
    
    private static int[] sum = new int[11];
    
    public int countNumbersWithUniqueDigits(int n) {
        sum[0] = 1;
        sum[1] = 10;
        if (n==0) return sum[0];
        else if (n==1) return sum[1];
        else if (n>1 && n<=10) {
            int temp = 0;
            int index = 0;
            int part = countNumbersWithUniqueDigits(n-1)*(10-n+1);
            while (index<n-1){
                temp += sum[index];
                index++;
            }
            return sum[n] = part + temp;
        } else return countNumbersWithUniqueDigits(10);
    }
}