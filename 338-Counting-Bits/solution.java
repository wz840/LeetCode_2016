public class Solution {
    public int[] countBits(int num) {
        int[] output = new int[num+1];
        for (int i=0; i<output.length; i++) {
            output[i] = countBit(i);
        } 
        return output;
    }
    
    public int countBit(int i){
        int n;
        for (n=0; i>0; n++) {
            i = i & i-1;
        }
        return n;
    }
}