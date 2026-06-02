func topKFrequent(nums []int, k int) []int {
	freqCountMap := make(map[int]int)
	for _, val := range nums {
		freqCountMap[val]++
	}

	arrList := make([][2]int, 0, len(freqCountMap))
	for num, count := range freqCountMap {
		arrList = append(arrList, [2]int{num, count})
	}

	sort.Slice(arrList, func(i, j int) bool {
		return arrList[i][1] > arrList[j][1]
	})

	var output []int = make([]int, k)
	for i := 0; i < k; i++ {
		output[i] = arrList[i][0]
	}
	return output

}
