class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] temp_char = s.toCharArray();
        Arrays.sort(temp_char);
        s = new String(temp_char);

        temp_char = t.toCharArray();
        Arrays.sort(temp_char);
        t = new String(temp_char);

        return s.equals(t);
    }
}