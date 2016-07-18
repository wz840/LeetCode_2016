public class Solution {
    public int bulbSwitch(int n) {
        /*if (n==0) return 0;
        else if (n==1) return 1;
        else {
            int[] bulb = new int[n];
            int round = 2;
            int counter = 0;
            for (int i=0; i<bulb.length; i++) {
                bulb[i] = 1;
            }
            while (round <=n) {
                for (int i=round-1; i<bulb.length; i=i+round){
                    bulb[i] = ~(bulb[i]) & 1;
                }
                round++;
                System.out.println(Arrays.toString(bulb));
            }
            for (int i=0; i<bulb.length; i++) {
                if (bulb[i]==1) counter++;
            }
            return counter;
            
        }*/
        return (int)Math.sqrt(n);
        
        
        
        
        
        
    }
}