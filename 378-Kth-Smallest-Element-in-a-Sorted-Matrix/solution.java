public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;
        if (k==1) return matrix[0][0];
        if (k==r*c) return matrix[r-1][c-1];
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                pq.add(matrix[i][j]);
            }
        }
        int index = 1;
        int result = 0;
        while(index<=k) {
            result = pq.poll().intValue();
            index++;
        }
        return result;
        
    }
}