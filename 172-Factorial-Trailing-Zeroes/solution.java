public class Solution {
    public int trailingZeroes(int n) {
        int k = 0;
        int sum = 0;
        if (n%5==0) k = n/5+1;
        else k = (int)(Math.ceil((Math.log(n))/(Math.log(5))-1));
        for (int i=1; i<=k; i++) {
            sum += (int)Math.floor(n/Math.pow(5,i));
        }
        return sum;
    }
}