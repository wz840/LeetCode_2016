public class Solution {
    public static boolean isPerfectSquare(int num) {
		int[] result = new int[46340];
		for (int i=0; i<result.length; i++) {
			result[i] = (i+1) * (i+1);			
		}
		return Arrays.binarySearch(result, num)>=0;		
    } 
}