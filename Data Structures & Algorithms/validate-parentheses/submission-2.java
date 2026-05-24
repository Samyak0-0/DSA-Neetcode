class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mapper = new HashMap<>();
        mapper.put(')', '(');
        mapper.put(']', '[');
        mapper.put('}', '{');

        Stack<Character> inputStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (mapper.containsKey(s.charAt(i))) {
                if (inputStack.isEmpty()) return false;
                Character topOfStack = inputStack.pop();
                if (topOfStack != mapper.get(s.charAt(i))) {
                    return false;
                }
            } else {
                inputStack.push(s.charAt(i));
            }
        }

        return inputStack.isEmpty();

    }
}
