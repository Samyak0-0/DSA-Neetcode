class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> s_Map = new HashMap<>();
        HashMap<Character, Integer> t_Map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            s_Map.put(s.charAt(i), s_Map.getOrDefault(s.charAt(i), 0) + 1);
            t_Map.put(t.charAt(i), t_Map.getOrDefault(t.charAt(i), 0) + 1);
        }

        return s_Map.equals(t_Map);
    }
}