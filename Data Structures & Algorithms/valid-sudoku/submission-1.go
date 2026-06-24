func isValidSudoku(board [][]byte) bool {

    rows := make([]int, 9)
    cols := make([]int, 9)
    square := make([]int, 9)

    for i:=0; i<9; i++ {
        for j:=0; j<9; j++ {
            if board[i][j] == '.' {
                continue
            }

            val := board[i][j] - '1'
            bit := 1 << val
            squareIndex := (i/3)*3 + j/3

            if rows[i]&bit != 0 || cols[j]&bit != 0 || square[squareIndex]&bit != 0 {
                return false
            }

            rows[i] |= bit
            cols[j] |= bit
            square[squareIndex] |= bit
        }
    }

    return true
}
