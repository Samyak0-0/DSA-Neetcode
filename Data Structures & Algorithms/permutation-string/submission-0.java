class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int i = 0;
        int j = s1.length();
        char[] sortedS1 = s1.toCharArray() ;
        Arrays.sort(sortedS1);
        s1 = new String (sortedS1);
        
        while (j <= s2.length()) {
            if (!s1.contains(String.valueOf(s2.charAt(i))) || !s1.contains(String.valueOf(s2.charAt(j-1)))) {
                i++;
                j++;
                continue;
            }

            String section = s2.substring(i,j);
            char[] tempCharArr = section.toCharArray();
            Arrays.sort(tempCharArr);
            String sortedSection = new String(tempCharArr);

            if (s1.equals(sortedSection)) return true;
            i++;
            j++;
        }

        return false;
    }
}
