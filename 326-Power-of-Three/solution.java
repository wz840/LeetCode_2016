public class Solution {
    
    /*public boolean isPowerOfThree(int n) {
        double epsilon = 0.0000000001;
        return (Math.log(n) / Math.log(3) + epsilon) % 1 <= 2 * epsilon;
    }*/
    
    public boolean isPowerOfThree(int n){
        int maxPow = (int) Math.floor(Math.log(Integer.MAX_VALUE) / Math.log(3));		
    	int max = (int)Math.pow(3, maxPow);
    	return n>0 && max%n==0;
    }
    
    
}