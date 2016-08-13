public class Solution {
    public boolean isUgly(int num) {
        if (num==0) return false;
        if (num==1) return true;
        if (num%2==0){
            return isUgly((int)num/2);
        }
        if (num%3==0){
            return isUgly((int)num/3);
        }
        if (num%5==0){
            return isUgly((int)num/5);
        }
        return false;
    }
}