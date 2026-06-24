func isValidSudoku(board [][]byte) bool {

    rows := make([]map[byte]bool,9)
    cols := make([]map[byte]bool,9)
    squares := make([]map[byte]bool,9)

    for i:=0; i<9; i++ {
        rows[i] = make(map[byte]bool)
        cols[i] = make(map[byte]bool)
        squares[i] = make(map[byte]bool)
    }

    for i:=0; i<9; i++ {
        for j:=0; j<9; j++ {
            if board[i][j] == '.' {
                continue
            }
            val := board[i][j]
            squareIndex := (i/3)*3 + j/3
            if rows[i][val] || cols[j][val] || squares[squareIndex][val] {
                return false
            }

            rows[i][val] = true
            cols[j][val] = true
            squares[squareIndex][val] = true
        }
    }
    return true
}
