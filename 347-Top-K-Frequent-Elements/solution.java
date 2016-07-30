public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(Integer.valueOf(nums[i]))+1);
            } else {
                hm.put(nums[i],1);
            }   
        }
        Map.Entry<Integer, Integer>[] entries = hm.entrySet().toArray(new Map.Entry[0]);
        
        Arrays.sort(entries, new Comparator<Map.Entry<Integer,Integer>>() {
        	@Override
        	public int compare(Map.Entry<Integer, Integer> o1,
        			Map.Entry<Integer, Integer> o2) {
        		if (o1.getValue()>o2.getValue()) return 1;
        		else if (o1.getValue()<o2.getValue()) return -1;
        		else return 0;
        	}
        });
        
        List<Integer> ls = new ArrayList<Integer>();
        for (int i=entries.length-1; i>=entries.length-k; i--) {
        	ls.add(entries[i].getKey());
        }
        
        return ls;
    }
}