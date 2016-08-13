public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<Integer>();
        int remain, squareSum;
        while (hs.add(n)) {
            squareSum = 0;
            while(n>0) {
                remain = n%10;
                squareSum += remain * remain;
                n = n/10;
            }
            if (squareSum==1) return true;
            else n = squareSum;
            
            
            
        }
        return false;
        
    }
}