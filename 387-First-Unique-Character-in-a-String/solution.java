public class Solution {
    public int firstUniqChar(String s) {
        int count;
        char[] ca = s.toCharArray();
        
        for (int i=0; i<ca.length; i++) {
            count = 0;
            if (ca[i]!=' ') {
                for (int j=i+1; j<ca.length; j++) {
                    if (ca[i]==ca[j]) {
                        ca[j]=' ';
                        count++;
                    }
                }
                if (count==0) return i;
            }
        }
        return -1;
        
    }
}