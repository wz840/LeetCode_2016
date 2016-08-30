public class Solution {
    public char findTheDifference(String s, String t) {
        return (char)(sumOfAsc(t) - sumOfAsc(s));
    }
    
    public int sumOfAsc(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            sum += (int)(s.charAt(i));
        }
        return sum;
    }
}