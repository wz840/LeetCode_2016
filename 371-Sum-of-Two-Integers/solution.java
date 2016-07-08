public class Solution {
    public int getSum(int a, int b) {
        if (b==0) return a;
        int uof = a ^ b;
        int of = (a & b)<<1;
        return getSum(uof, of);
        
    }
}