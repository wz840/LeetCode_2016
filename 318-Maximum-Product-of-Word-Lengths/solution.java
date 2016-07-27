public class Solution {
    
    public int maxProduct(String[] words) {
        if (words.length<=1) return 0;
        else {
            /*Arrays.sort(words, new Comparator<String>(){
                @Override
                public int compare (String s1, String s2) {
                    if (s1.length()>s2.length()) return 1;
                    else if (s1.length()==s2.length()) return 0;
                    else return -1;
                }
            });*/
           /* for (int i=words.length-1; i>0; i--) {
                if (!isIntersected(words[i], words[i-1]))
                return words[i].length() * words[i-1].length();
            }*/
            int mask[] = new int[words.length];
            for (int i=0; i<words.length; i++) {
                for (int j=0; j<words[i].length(); j++) {
                    mask[i] |= 1 << (words[i].charAt(j) - 'a');
                }
            }
            
            
            
            
            
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
    
    
    
    public boolean isIntersected(String s1, String s2) {
        
        
        for (int i=0; i<s1.length(); i++) {
            for (int j=0; j<s2.length(); j++){
                int n1 = (int)s1.charAt(i);
                int n2 = (int)s2.charAt(j);
                int n = n1 & n2;
                if (n==n1 && n==n2) return true;
            }
        }
        return false;
        
        
        
    }
}