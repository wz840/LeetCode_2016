public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        int current = matrix[i][j];
        while(current!=target) {
            if (target>current){
                i++;
                if (i>matrix.length-1) return false;
                current = matrix[i][j];
            } else {
                j--;
                if (j<0) return false;
                current = matrix[i][j];
            }
        }
        return true;
    }
}