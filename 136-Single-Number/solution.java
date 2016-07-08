public class Solution {
    public int singleNumber(int[] nums) {
        /*
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
        return single;*/
        
	    int bit=0;
	    int result=0;
	    for(int i=0;i<32;i++){
	        bit=0;
		    for(int j=0;j<nums.length;j++){
		        if(((nums[j]>>i)&1)==1){
				    bit++;
			    }
		    } 
		    bit=bit%2;
		    result=result|bit<<i;
	    }
	    return result;
    }
}