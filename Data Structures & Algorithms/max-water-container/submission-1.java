class Solution {
    public int maxArea(int[] heights) {

        int i = 0;
        int j = heights.length-1;
        int maxWaterStore = 0;

        while (i < j) {
            maxWaterStore = Math.max(maxWaterStore, (j-i)*Math.min(heights[i], heights[j]));

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }

        }
        
        return maxWaterStore;
    }
}
