public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length==1) return nums[0];
        else {
            // Time Exceeded
            /*Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            int o = 1;
            int x = 0;
            int max = nums.length/2;
            for (int i=1; i<nums.length; i++) {
                if (nums[i]==nums[i-1]) o++;
                if (o>max) {
                    x = nums[i];
                    break;
                }
                System.out.println(o);
            }
            return x;*/
            
            // Time Exceeded
            /*ArrayList<Integer> ls = new ArrayList<Integer>();
            for (int i=0; i<nums.length; i++) {
                ls.add(nums[i]);
            }
            int index = ls.size()-1;
            while(index>0) {
                System.out.println(index);
                if (!ls.get(index).equals(ls.get(index-1))) {
                    ls.remove(index);
                    ls.remove(index-1);
                    index--;
                    if (index>=ls.size()) index--;
                } else {
                    index--;
                }
            }
            return ls.get(0);*/
            
            int counter = 0;
            int maj = 0;
            int max = nums.length/2;
            for (int i=0; i<nums.length; i++) {
                if (counter==0){
                    maj = nums[i];
                    counter++;
                }
                else {
                    counter = (nums[i]==maj) ? counter+1 : counter-1;
                }
                
                if (counter>max) return maj;
            }
            return maj;
            
            
            
            
            
            
        }
    }
}