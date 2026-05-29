class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        for (int i=0; i<heights.length; i++) {
            int j = i;
            int k = i;

            while (j>=0 && heights[j] >= heights[i] ) {
                j--;
            }
            j++;

            while (k<heights.length && heights[k] >= heights[i] ) {
                k++;
            }
            k--;

            int currArea = heights[i] * (k-j+1);
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;   
    }
}
