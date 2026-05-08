class Solution {
    public boolean isAnagram(String s, String t) {

        int s_len = s.length();
        int t_len = t.length();

        if (s_len != t_len) return false;

        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for (char ch: s.toCharArray()) {
            if (map_s.containsKey(ch)) {
                map_s.put(ch, map_s.get(ch) + 1);
            } else {
            map_s.put(ch, 1);
            }
        }

        for (char ch: t.toCharArray()) {
            if (map_t.containsKey(ch)) {
                map_t.put(ch, map_t.get(ch) + 1);
            } else {
            map_t.put(ch, 1);
            }
        }

        return map_s.equals(map_t);
    }
}
