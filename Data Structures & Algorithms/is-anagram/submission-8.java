class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] charFreqArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charFreqArray[s.charAt(i) - 'a']++;
            charFreqArray[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charFreqArray[i] != 0)
                return false;
        }
        return true;
    }
}