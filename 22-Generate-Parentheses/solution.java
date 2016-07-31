public class Solution {
    public List<String> generateParenthesis(int num) {
        if (num==1) {
            List<String> ls = new ArrayList<String>();
            ls.add("()");
            return ls;
        }
        
        
        int bits = num*2 - 2;
		int max = (int)Math.pow(2, bits)-1;
		
		List<String> binaryList = new ArrayList<String>();
		for (int i=1; i<=max; i++) {
			int totalBits = 0;			
			for (int j=0; j<bits; j++){
				int temp = i;
				int c = (temp>>j) & 1;				
				totalBits += c;
			}
			if (totalBits==(num-1)) {
				String br = Integer.toBinaryString(i);
				int d = bits - br.length();
				if (d!=0) {
					for (int k=0; k<d; k++) {
						br = "0" + br;
					}
				}
				br = "1" + br + "0";
				int token = 0;
				for (int n=0; n<br.length(); n++) {
					char c = br.charAt(n);
					if (token<=0 && '0'==c) {
						br = "";
						break;
					}
					if ('1' == c) token++;
					else token--;					
				}
				System.out.println(i + "  " + br);
				if (""!=br) binaryList.add(br);
			}
		}
		return toParentheses(binaryList);
	}
	
	public static List<String> toParentheses(List<String> binaryList) {
		List<String> ls = new ArrayList<String>();		
		for (String str: binaryList) {
			String parentheses = "";
			for (int i=0; i<str.length(); i++) {
				if ('1'==str.charAt(i)) {
					parentheses += "(";
				} else parentheses += ")";
			}
			ls.add(parentheses);
		}		
		return ls;
		
	}
}