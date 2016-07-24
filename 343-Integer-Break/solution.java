public class Solution {
    Boolean recurrsion = false;
    public int integerBreak(int n) {
        int result = 1;
        if (n<=2) return result;
        else {
            int pow = n/3;
            int base = (int)Math.pow(3,pow);
            if (n==3) return 2;
            else {
                if (n%3==0) result = base;
                else if (n%3==1) result = base + (int)Math.pow(3,pow-1);
                else result = base * 2;
            }
        } 
        return result;
    }
    
}