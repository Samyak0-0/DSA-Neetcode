class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int targetRow = 0;
        boolean targetRowFound = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][cols - 1] < target) {
                continue;
            } else {
                targetRowFound = true;
                targetRow = i;
                break;
            }
        }

        if (!targetRowFound) {
            return false;
        }

        int i = 0, j = cols - 1;
        while (i <= j) {
            int index = (i + j) / 2;
            if (matrix[targetRow][index] == target) {
                return true;
            } else if (matrix[targetRow][index] > target) {
                j = index - 1;
            } else {
                i = index + 1;
            }
        }
        return false;
    }
}
