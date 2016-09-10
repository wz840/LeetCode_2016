public class Solution {
    public static int[][] generateMatrix(int n) {
        
		
		int rowMax = n - 1;
		int colMax = n - 1;
		int rowMin = 0;
		int colMin = 0;
		int index = 1;
		int r = 0;
		int c = 0;
		int[][] matrix = new int[n][n];
		String direction = "row";
		Boolean increase = true;
		while (index <= n * n) {
			if (increase && "row".equals(direction)) {
				matrix[r][c] = index;
				if (c == colMax) {
					direction = changeDirection(direction);
					rowMin++;
					r++;
				} else
					c++;
			}

			else if (increase && "column".equals(direction)) {
				matrix[r][c] = index;
				if (r == rowMax) {
					direction = changeDirection(direction);
					if (c==colMax) {
						increase = !increase;
						rowMax--;
						colMax--;
					}
					c--;
				} else
					r++;
			}

			else if (!increase && "row".equals(direction)) {
				matrix[r][c] = index;
				if (c == colMin) {
					direction = changeDirection(direction);
					r--;
				} else
					c--;
			}

			else if (!increase && "column".equals(direction)) {
				matrix[r][c] = index;
				if (r == rowMin) {
					direction = changeDirection(direction);
					if (c==colMin) increase = !increase;
					colMin++;
					c++;
				} else
					r--;
			}
			index++;
		}
		return matrix;
	}

	public static String changeDirection(String direction) {
		return ("row".equals(direction) ? "column" : "row");
	}
}