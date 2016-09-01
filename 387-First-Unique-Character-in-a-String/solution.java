public class Solution {
    public int firstUniqChar(String s) {
        /*Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i=0; i<s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), 1);
            } else {
                hm.put(s.charAt(i), hm.get(s.charAt(i)+1));
            }
        }
        Iterator<Map.Entry<Character, Integer>> it = hm.entrySet().iterator(); 
        while (it.hasNext()) {
            Map.Entry<Character, Integer> me = it.next();
            if (me.getValue().equals(1)) {
                return s.indexOf(me.getKey().charValue());
            }
        }
        return -1;*/
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