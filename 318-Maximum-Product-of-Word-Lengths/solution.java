public class Solution {
    
    public int maxProduct(String[] words) {
        if (words.length<=1) return 0;
        else {
            /**
             * Mask is maintained for storing the bit representation of String words from words[] 
             * abc can be represented by a 26-bit binary
             * 
             * abc - 00000 00000 00000 00000 000111
             * fcf - 00000 00000 00000 00000 100100
             * 
             **/
            int mask[] = new int[words.length];
            for (int i=0; i<words.length; i++) {
                for (int j=0; j<words[i].length(); j++) {
                    mask[i] |= 1 << (words[i].charAt(j) - 'a');
                }
            }
            // Two string with common character(s) will not get zero after & operation
            int max = 0;
            for (int i=0; i<words.length; i++) {
                for (int j=i+1; j<words.length; j++) {
                    if ((mask[i] & mask[j]) == 0) {
                        int current = words[i].length() * words[j].length();
                        max = (current > max )? current:max;
                    }
                }
            }
            return max;
        }
    }
}