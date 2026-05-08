class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while (j>i) {

            while (!Character.isLetterOrDigit(s.charAt(i)) || !Character.isLetterOrDigit(s.charAt(j))) {
                if (!Character.isLetterOrDigit(s.charAt(i))) {
                    if (i<s.length()-1) {
                        i++;
                    } else  {
                        return true;
                    }

                }
                if (!Character.isLetterOrDigit(s.charAt(j))) {
                    if (j>0) {
                        j--;
                    } else  {
                        return true;
                    }

                }
                   
            }

            char ch_i = s.charAt(i);
            char ch_j = s.charAt(j);

            if(Character.toLowerCase(ch_i) != Character.toLowerCase(ch_j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
