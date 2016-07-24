public class Solution {
    public boolean isPowerOfThree(int n) {
        double epsilon = 0.0000000001;
        return (Math.log(n) / Math.log(3) + epsilon) % 1 <= 2 * epsilon;
    }
}