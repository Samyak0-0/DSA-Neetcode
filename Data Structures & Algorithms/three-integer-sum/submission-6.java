class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0, k = nums.length - 1;
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            j = i + 1;
            k = nums.length - 1;
            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                    continue;
                }

                if (sum < 0) {
                    j++;
                    continue;
                }

                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
        }

        return result;
    }
}
