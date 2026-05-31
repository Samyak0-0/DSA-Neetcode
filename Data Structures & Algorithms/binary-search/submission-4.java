class Solution {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        while (i<=j) {
            int index = (i + j) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                j--;
            } else {
                i++;
            }
        }

        return -1;
    }
}
