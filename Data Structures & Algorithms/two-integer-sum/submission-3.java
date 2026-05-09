class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[][] sortedNums = new int[nums.length][2];
        for (int i=0; i<nums.length; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }

        Arrays.sort(sortedNums, Comparator.comparingInt(a -> a[0]));

        int i = 0;
        int j = nums.length - 1;

        while(sortedNums[i][0] + sortedNums[j][0] != target) {
            if (sortedNums[i][0] + sortedNums[j][0] > target) {
                j--;
            } else {
                i++;
            }
        }

        return sortedNums[i][1] > sortedNums[j][1] ? new int[] {sortedNums[j][1],sortedNums[i][1]} :  new int[] {sortedNums[i][1],sortedNums[j][1]};

    }
}
