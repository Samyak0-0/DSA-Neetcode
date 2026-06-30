class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minEatingSpeed = 1;

        while (true) {
            long totalEatingTime = 0;
            for (int pile : piles) {
                totalEatingTime += pile / minEatingSpeed;
                if (pile % minEatingSpeed != 0) {
                    totalEatingTime += 1;
                }
            }
            if (totalEatingTime <= h) {
                return minEatingSpeed;
            }
            minEatingSpeed++;
        }
    }
}
