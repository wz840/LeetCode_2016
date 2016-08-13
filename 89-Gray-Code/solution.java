public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        int base = 1;
        int totalSize = 1<<n;
        while (result.size() < totalSize){
            List<Integer> temp = new ArrayList<Integer>(result);
            for (int i=temp.size()-1; i>=0; i--) {
                result.add(temp.get(i) ^ base);
            }
            base *= 2;
            
        }
        return result;
        
    }
}