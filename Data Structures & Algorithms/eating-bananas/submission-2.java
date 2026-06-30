class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxEatingSpeed = 0;
        for (int pile : piles) {
            maxEatingSpeed = Math.max(maxEatingSpeed, pile);
        }

        int l = 1;
        int r = maxEatingSpeed, minEatingSpeed = maxEatingSpeed;

        while (l <= r) {
            int speed = (l + r) / 2;
            long totalTime = 0;
            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / speed);
            }
            if (totalTime <= h) {
                minEatingSpeed = Math.min(minEatingSpeed, speed);
                r = speed - 1;
            } else {
                l = speed + 1;
            }
        }

        return minEatingSpeed;
    }
}
