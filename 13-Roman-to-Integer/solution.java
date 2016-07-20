public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int temp = 0;
        int current = 0;
        int pre = 0;
        char[] arr = s.toCharArray();
        for (int i=0; i<arr.length; i++) {
            current = singleRomanToInt(arr[i]);
            if (i==0) {
                temp = sum;
                sum = current;
            }
            else {
                pre = singleRomanToInt(arr[i-1]);
                if (current<=pre) {
                    temp = sum;
                    sum += current;
                }
                else {
                    sum = temp + current - pre;
                }
            }
        }
        return sum;
    }
    
    public int singleRomanToInt(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: return 0;
        }
    }
}