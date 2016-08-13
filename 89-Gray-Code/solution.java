public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);                      // Always starts with 0
        int base = 1;                       // Base with which does XOR
        int totalSize = 1<<n;               // Total size of the result
        while (result.size() < totalSize){
            List<Integer> temp = new ArrayList<Integer>(result); // Resize the temp list
            for (int i=temp.size()-1; i>=0; i--) {
                result.add(temp.get(i) ^ base);
            }
            base *= 2;
            
        }
        return result;
        
    }
}