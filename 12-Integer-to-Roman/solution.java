public class Solution {
    public String intToRoman(int num) {
        String[][] roman = new String[][]{
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}};
            
        StringBuffer str = new StringBuffer();
        
        str.append(roman[3][(num/1000)%10]);
        str.append(roman[2][(num/100)%10]);
        str.append(roman[1][(num/10)%10]);
        str.append(roman[0][(num%10)]);
        
        return str.toString();
    }
}