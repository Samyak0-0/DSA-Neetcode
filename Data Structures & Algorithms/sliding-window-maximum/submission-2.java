class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int maxInt = -10001;
        int outLen = nums.length - k + 1;
        int[] output = new int[outLen];

        for (int i=0; i<outLen; i++) {

            for (int j=i; j<k+i; j++) {
                maxInt = Math.max(maxInt, nums[j]);
            }
            output[i] = maxInt;
            maxInt = -10001;
        }

        return output;
    }
}
