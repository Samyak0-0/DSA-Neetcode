func productExceptSelf(nums []int) []int {

   	prod := 1
	zeroCount := 0
	nums_len := len(nums)

	for _, element := range nums {
		if element == 0 {
			zeroCount++
		} else {
			prod *= element
		}
	}

	if zeroCount > 1 {
		return make([]int, nums_len)
	}

	res := make([]int, nums_len)
	if zeroCount == 0 {
		for i := 0; i < nums_len; i++ {
			res[i] = prod / nums[i]
		}
	} else {
		for i := 0; i < nums_len; i++ {
			if nums[i] == 0 {
				res[i] = prod
			} else {
				res[i] = 0
			}
		}
	}

	return res
}
