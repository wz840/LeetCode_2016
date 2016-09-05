public class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        char[] ca = s.toCharArray();
        int tail = ca.length-1;
        while(i<tail) {
            if (isVowel(ca[i])) {
                for (int j=tail; j>=i; j--){
                    if (isVowel(ca[j])) {
                        tail = j-1;
                        char temp = ca[j];
                        ca[j] = ca[i];
                        ca[i] = temp;
                        break;
                    }
                }
            }
            i++;
        }
        return String.valueOf(ca);
        
        
        
    }
    
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    
    public String catCharArray(char[] ca) {
        String result = "";
        for (char c: ca) {
            result += c;
        }
        return result;
    }
}