class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i<s.length(); i++) {
            t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
        }

        if (t.length() == 0) return true;

        return false;

    }
}
