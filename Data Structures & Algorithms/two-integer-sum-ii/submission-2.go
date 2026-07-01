func twoSum(numbers []int, target int) []int {
    mp := make(map[int]int)
    for i, num := range numbers {
        compl := target - num
        val, exists := mp[compl]
        if (exists) {
            return []int {val, i+1}
        }
        mp[num] = i+1
    }
    return []int{}
}
