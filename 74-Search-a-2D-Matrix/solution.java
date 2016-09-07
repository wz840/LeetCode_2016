public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
		int[] column = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			column[i] = matrix[i][0];
		}
		int row = binarySearchColumn(column, target, 0, column.length - 1);
		return binarySearchRow(matrix[row], target, 0, matrix[row].length-1);
	}

	public int binarySearchColumn(int[] column, int target, int left,
			int right) {

		int mid = (left + right) / 2;
		if (target < column[mid]) {
			if (mid - 1 < left) {
				if (mid-1<0) return mid;
				return mid-1;
			}
			return binarySearchColumn(column, target, left, mid - 1);
		} else if (target > column[mid]) {
			if (mid + 1 > right)
				return mid;
			return binarySearchColumn(column, target, mid + 1, right);
		} else
			return mid;
	}

	public static boolean binarySearchRow(int[] row, int target, int left,
			int right) {
		int mid = (left + right) / 2;
		if (target < row[mid]) {
			if (mid - 1 < left)
				return false;
			return binarySearchRow(row, target, left, mid - 1);
		} else if (target > row[mid]) {
			if (mid + 1 > right)
				return false;
			return binarySearchRow(row, target, mid + 1, right);
		} else
			return true;

	}
}