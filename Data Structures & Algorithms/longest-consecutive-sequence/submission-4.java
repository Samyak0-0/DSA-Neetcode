class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int res = 0;
        for (int num : nums) {
            int currStreak = 0, currNum = 0;
            if (!numSet.contains(num - 1)) {
                currNum = num;
                while (numSet.contains(currNum)) {
                    currStreak++;
                    currNum++;
                }
            }

            res = Math.max(currStreak, res);
        }

        return res;
    }
}
