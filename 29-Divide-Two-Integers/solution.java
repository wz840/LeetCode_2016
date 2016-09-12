public class Solution {
    public int divide(int dividend, int divisor) {
    	boolean isNegative = (dividend>0 && divisor<0) || ((dividend<0) && (divisor>0));
    	long absDividend = Math.abs((long)dividend);
    	long absDivisor = Math.abs((long)divisor);
    	long result = 0;
    
    	while(absDividend>=absDivisor) {
    	    long count = 1;
    	    long temp = absDivisor;
    	    while (temp<=absDividend) {
    	        temp <<= 1;
    	        count <<= 1;
    	    }
    	    result += count>>1;
    	    absDividend -= temp>>1;
    	}
    	
    	if (isNegative) return (int) ~result+1;
    	else return (result>Integer.MAX_VALUE)? Integer.MAX_VALUE: (int)result;
    	
    	
    	
    }
}