public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        else if (""==s && ""==t) return true;
        else {
            HashMap<String,Integer> hms = new HashMap<String,Integer>();
            HashMap<String,Integer> hmt = new HashMap<String,Integer>();

            for (int i=0; i<s.length(); i++) {
                String key = s.charAt(i) + "";
                Integer value = hms.get(key);
                if (hms.containsKey(key)) hms.put(key,value+1);
                else hms.put(key,Integer.valueOf(1));
            }
            for (int i=0; i<t.length(); i++) {
                String key = t.charAt(i) + "";
                Integer value = hmt.get(key);
                if (hmt.containsKey(key)) hmt.put(key,value+1);
                else hmt.put(key,Integer.valueOf(1));
            }
            return hms.equals(hmt);
        }
    }
}