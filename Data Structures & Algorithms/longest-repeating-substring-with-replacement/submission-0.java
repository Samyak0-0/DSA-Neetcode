class Solution {
    public int characterReplacement(String s, int k) {

        int result=0;
        for (int i=0; i<s.length(); i++) {
            Map<Character, Integer> freqCounter = new HashMap<>();
            int maxFreq = 0;
            for (int j=i; j<s.length(); j++) {
                freqCounter.put(s.charAt(j), freqCounter.getOrDefault(s.charAt(j), 0) + 1);
                maxFreq = Math.max(freqCounter.get(s.charAt(j)), maxFreq);

                if ((j-i+1) - maxFreq <=  k) {
                    result = Math.max(result, j-i+1);
                }

            }
        }

        return result;
    }
}
