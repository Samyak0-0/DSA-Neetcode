class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder revStr = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (isAlphaNum(c)) {
                str.append(Character.toLowerCase(c));
                revStr.insert(0,Character.toLowerCase(c));
            }
        }

        return str.toString().equals(revStr.toString());
    }

    public boolean isAlphaNum(char c) {
        return (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9');
    }
}
