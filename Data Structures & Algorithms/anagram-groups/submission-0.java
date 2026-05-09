class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> myMap = new HashMap<>();

        for (String str: strs) {

            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            if (myMap.containsKey(sortedStr)) {
                myMap.get(sortedStr).add(str);
                continue;
            }

            List<String> new_list = new ArrayList<>();
            new_list.add(str);
            myMap.put(sortedStr, new_list);
        }

        // return new ArrayList<>(myMap.values());
        List<List<String>> output = new ArrayList<List<String>>();
        for(List<String> group: myMap.values()) {
            output.add(group);
        }
        return output;
    }
}
