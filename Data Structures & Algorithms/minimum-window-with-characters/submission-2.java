class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int i = 0;
        int j = t.length() - 1;
        String minSubstring = "";

        HashMap<Character, Integer> tCharFreq = new HashMap<>();

        for (int k=0; k<t.length(); k++) {
            tCharFreq.put(t.charAt(k), tCharFreq.getOrDefault(t.charAt(k), 0) +  1);
        }

        while (j<s.length()) {
            if (!t.contains(String.valueOf(s.charAt(i)))) {
                if (i<j) {
                    i++;
                } else {
                    i++;
                    j++;
                }
                continue;
            }
            HashMap<Character, Integer> windowFreq = new HashMap<>();
            for (int k=i; k<=j; k++) {
                windowFreq.put(s.charAt(k), windowFreq.getOrDefault(s.charAt(k), 0) +  1);
            }

            boolean validWindow = true;
            for (Character c: tCharFreq.keySet()) {
                if (tCharFreq.get(c) > windowFreq.getOrDefault(c, 0)) {
                    validWindow = false;
                    break;
                }
            }

            if (validWindow) {
                if (minSubstring.length() == 0 || minSubstring.length() > j-i+1) {
                    minSubstring = s.substring(i,j+1);
                }
                if (i<j) {
                    i++;
                } else {
                    i++;
                    j++;
                }
            } else {
                j++;
            }

        }

        return minSubstring;
    }
}
