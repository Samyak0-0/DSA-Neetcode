class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> row = new HashSet<>();
        HashSet<Character>[] column = new HashSet[9];
        HashSet<Character>[] square = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            column[i] = new HashSet<>();
            square[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char val = board[i][j];

                if (val == '.') {
                    continue;
                }

                if (!row.add(val)) {
                    return false;
                }

                if (!column[j].add(val)) {
                    return false;
                }

                int squareNo = (i / 3) * 3 + (j / 3);
                if (!square[squareNo].add(val)) {
                    return false;
                }
            }

            row.clear();

        }

        return true;

    }
}