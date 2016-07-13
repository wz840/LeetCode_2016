public class Solution {
    public int titleToNumber(String s) {
        s = s.toUpperCase();
        if (s.length()==0) return 0;
        else {
            return stringToAsc(s);
        }
    }
    
    private int stringToAsc(String s) {
        int num = 0;
        int bit = s.length()-1;
        for (int i=0; i<s.length(); i++) {
            //num += ((int)s.charAt(i) - 64) * Math.pow(26,bit-i);
            num += (Integer.valueOf(s.charAt(i)+"", 36) - 9) * Math.pow(26,bit-i);
        }
        return num;
    }
}