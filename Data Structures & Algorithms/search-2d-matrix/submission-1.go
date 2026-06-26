func searchMatrix(matrix [][]int, target int) bool {

    m, n := len(matrix), len(matrix[0])

    i, j := 0, m-1
    targetRow := 0
    targetRowFound := false

    for i <= j {
        index := (i+j) / 2
        if (target >= matrix[index][0] && target <= matrix[index][n-1]) {
            targetRowFound = true
            targetRow = index
            break
        } else if target < matrix[index][0] {
            j = index  - 1
        } else {
            i = index + 1
        }
    }

    if (!targetRowFound) {
        return false
    }

    i, j = 0, n-1
    k := targetRow
    for i <= j {
        index := (i+j) / 2
        if (target == matrix[k][index]) {
            return true
        } else if target < matrix[k][index] {
            j = index  - 1
        } else {
            i = index + 1
        }
    }
    return false
}
