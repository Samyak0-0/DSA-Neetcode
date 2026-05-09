class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            boolean exists = false;
            List<Integer> myRow = new ArrayList<>();
            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(j).get(0) == nums[i]) {
                    myRow = myList.get(j);
                    myRow.set(1, myRow.get(1) + 1);
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                myRow.clear();
                myRow.add(nums[i]);
                myRow.add(1);
                myList.add(myRow);
            }
        }

        myList.sort((a, b) -> b.get(1) - a.get(1));

        int[] output = new int[k];
        for (int l = 0; l < k; l++) {
            output[l] = myList.get(l).get(0);
        }
        return output;
    }
}
