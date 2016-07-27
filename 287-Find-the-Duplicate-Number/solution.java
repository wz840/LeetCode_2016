public class Solution {
    public int findDuplicate(int[] nums) {
        /*List<Integer> ls = new ArrayList<Integer>();
        for (int i=0; i<nums.length; i++) {
            ls.add(nums[i]);
        }
        Set<Integer> hs = new HashSet<Integer>(ls);
        int size = hs.size();*/
        int dup = 0;
        int[] o = new int[nums.length-1];
        for (int i=0; i<nums.length; i++){
            o[nums[i]-1] += nums[i];
        }
        for (int i=0; i<o.length; i++) {
            if (o[i]!=i+1 && o[i]!=0) dup = i+1;
        }
        return dup;
    }
}