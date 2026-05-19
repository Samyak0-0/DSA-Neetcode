class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 1;
        int currentLen = 1;
        int j = 0;
        Arrays.sort(nums);

        while (j < nums.length - 1) {
            if (nums[j + 1] == nums[j]) {
                j++;
                continue;
            }
            if ((nums[j + 1] - nums[j]) == 1) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
            j++;
        }
        return nums.length > 0 ? maxLen : 0;
    }
}
