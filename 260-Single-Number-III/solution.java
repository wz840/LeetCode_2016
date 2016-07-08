public class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		int[] dnum = new int[2];
		for (int x: nums) {
			if (hm.containsKey(x)) hm.put(x, x+1);
			else hm.put(x, x);
		}
		int index = 0;
		Iterator<Map.Entry<Integer,Integer>> it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> e = it.next();
			if (e.getValue().equals(e.getKey())) {
				dnum[index] = e.getKey().intValue();
				index++;
				if (index==2) break;
			}
		}
		return dnum;
        
        
    }
}