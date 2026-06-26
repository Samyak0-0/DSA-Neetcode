class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            intSet.add(num);
        }

        int res = 0;
        for (int num : nums) {
            int currStreak = 0, currNum = num;

            while (intSet.contains(currNum)) {
                currStreak++;
                currNum++;
            }

            res = Math.max(currStreak, res);
        }
        return res;
    }
}
