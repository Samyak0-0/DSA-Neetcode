class Solution {
    public boolean isAnagram(String s, String t) {

        int s_len = s.length();
        int t_len = t.length();

        if (s_len != t_len) return false;

        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for(int i = 0; i<s_len; i++) {
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);

            if (map_s.containsKey(ch_s)) {
                map_s.put(ch_s, map_s.get(ch_s) + 1);
            } else {
                map_s.put(ch_s, 1);
            }
            
            if (map_t.containsKey(ch_t)) {
                map_t.put(ch_t, map_t.get(ch_t) + 1);
            } else {
                map_t.put(ch_t, 1);
            }

        }

        return map_s.equals(map_t);
    }
}
