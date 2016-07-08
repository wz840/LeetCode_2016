public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
        int single = 0;
        for (int x:nums) {
            if (ht.containsKey(x)) ht.put(x,x+1);
            else ht.put(x,x);
        }
        Iterator<Map.Entry<Integer, Integer>> it = ht.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> e = it.next();
            if (e.getValue().equals(e.getKey())) {
                single = e.getKey().intValue();
                break;
            }
        }
        return single;
    }
}