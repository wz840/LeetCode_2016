public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1) return false;
        return (n & (1 << ((int)(Math.log(n)/Math.log(2))))) == n;
    }
}