class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0, j = m * n - 1;
        while (i <= j) {
            int index = (i + j) / 2;

            if (target == matrix[index / n][index % n]) {
                return true;
            } else if (target < matrix[index / n][index % n]) {
                j = index - 1;
            } else {
                i = index + 1;
            }
        }
        return false;
    }
}
