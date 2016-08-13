public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> ls = new ArrayList<Character>();
        for (int i=0; i<magazine.length();i++){
            ls.add(magazine.charAt(i));
        }
        //System.out.println(Arrays.toString(ls.toArray()));
        
        for (int i=0; i<ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (ls.contains(c)) {
                ls.remove(ls.indexOf(c));
            } else return false;
        }
        return true;
        
        
    }
}