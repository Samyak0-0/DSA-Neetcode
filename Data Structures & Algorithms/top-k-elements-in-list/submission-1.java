class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> tempList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            tempList.add(new int[] {entry.getKey(), entry.getValue()});
        }
        tempList.sort((a, b) -> b[1] - a[1]);

        int[] output = new int[k];
        for (int i = 0; i < k; i++) {
            output[i] = tempList.get(i)[0];
        }

        return output;
    }
}
