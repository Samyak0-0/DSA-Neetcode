class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];

        System.out.println(Arrays.toString(rows));

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }

                int bit = board[i][j] - '1';
                int val = 1 << bit;
                int squareIndex = (i/3) * 3 + j/3;

                if ((rows[i]&val) != 0 || (cols[j]&val) != 0 || (squares[squareIndex]&val) != 0) {
                    return false;
                }

                rows[i] |= val;
                cols[j] |= val;
                squares[squareIndex] |= val;
            }
        }

        return true;
    }
}
