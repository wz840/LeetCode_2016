public class Solution {
    public int addDigits(int num) {
        return (num%9==0) ? ((num==0) ? 0:9) : num%9;
        // if (num==0) return 0;
        // if (num%9==0) return 9;
        // else return num%9;
    }
}