class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int count = position.length;
        double time[] = new double[count];

        for (int i=0; i<count; i++) {
            time[i] = (double) (target - position[i]) / speed[i];
        }

        
        for (int i=0; i<count; i++) {
            for (int j=i+1; j<count; j++) {
                if (position[j] > position[i]) {
                    int temp = position[i];
                    double temp2 = time[i];

                    position[i] = position[j];
                    time[i] = time[j];

                    position[j] = temp;
                    time[j] = temp2;
                }
            }
            
            if (i>0) {
                time[i] = Math.max(time[i], time[i-1]);
            }
        }

        int fleetNo = 1;
        for (int i=0; i<time.length-1; i++) {
            if (time[i] != time[i+1]) fleetNo++;
        }

        return fleetNo;
    }
}
