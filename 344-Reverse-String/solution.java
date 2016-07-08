public class Solution {
    public String reverseString(String s) {
        char[] cArray = s.toCharArray();
        for (int i=0; i<cArray.length/2; i++) {
            char temp;
            temp = cArray[i];
            cArray[i] = cArray[cArray.length-i-1];
            cArray[cArray.length-i-1] = temp;
        }
        String reverse = new String(cArray);
        return reverse;
    }
}