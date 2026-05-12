class Solution {

    public String encode(List<String> strs) {
        String encoded = new String();
        for (String str : strs) {
            encoded = encoded.concat(String.valueOf(str.length()));
            encoded = encoded.concat("$");
            encoded = encoded.concat(str);
        }
        return encoded;

    }

    public List<String> decode(String str) {

        int j = 0;
        int len = 0;

        List<String> out = new ArrayList<>();

        while (j < str.length()) {
            len = 0;
            while (!String.valueOf(str.charAt(j)).equals("$")) {
                len = len * 10 + Character.getNumericValue(str.charAt(j));
                j++;
            }
            String subStr = str.substring(j + 1, j + 1 + len);
            out.add(subStr);
            j = j + 1 + len;
        }

        return out;
    }
}
