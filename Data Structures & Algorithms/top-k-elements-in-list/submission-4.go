func topKFrequent(nums []int, k int) []int {

	freqMap := make(map[int]int)
	freqList := make([][]int, len(nums)+1)

	for _, val := range nums {
		freqMap[val]++;
	}

	for num, count := range freqMap {
		freqList[count] = append(freqList[count], num)
	}

	res := []int{}
	for i:=len(freqList)-1; i>0; i-- {
		for _,num := range freqList[i] {
			res = append(res, num)
			if len(res) == k {
				return res
			}
		}
	}

	return res
}
