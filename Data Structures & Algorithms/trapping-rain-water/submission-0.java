class Solution {
    public int trap(int[] height) {

        int len = height.length;
        int totalWaterTrap = 0;
        if (len==0) return 0;

        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];

        maxLeft[0] = height[0];
        maxRight[len-1] = height[len-1];

        for (int i=1; i<len; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
            maxRight[len-i-1] = Math.max(maxRight[len-i], height[len-i-1]);
        }

        for (int i=0; i<len; i++) {
            totalWaterTrap += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return totalWaterTrap;

    }
}
