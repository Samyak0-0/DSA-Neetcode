class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();

        for (String str : strs) {
            int[] charFreqCount = new int[26];
            for (char ch : str.toCharArray()) {
                charFreqCount[ch - 'a']++;
            }
            String mapKey = Arrays.toString(charFreqCount);

            myMap.putIfAbsent(mapKey, new ArrayList<>());
            myMap.get(mapKey).add(str);
        }

        return new ArrayList<>(myMap.values());
    }
}
