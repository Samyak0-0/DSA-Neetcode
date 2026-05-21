class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        int currLen = 0;
        if (s.length() == 0) return maxLen;

        int i = 0;
        int j = 0;

        Set<Character> currSet = new HashSet<>();         

        while (j < s.length()) {

            if(currSet.add(s.charAt(j))) {
                currLen++;
                maxLen = Math.max(currLen, maxLen);
                j++;
            } else {
                currLen--;
                currSet.remove(s.charAt(i));
                i++;
            }
            
        }

        return maxLen;
    }
}
