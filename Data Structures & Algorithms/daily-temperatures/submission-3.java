class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> myStack = new Stack();
        Stack<Integer> secondStack = new Stack();
        int[] output = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++) {
            myStack.push(temperatures[i]);
        }

        int i = 0;
        while (!myStack.isEmpty()) {
            int topOfStack = myStack.peek();
            int warmerTemp = 0;
            int count = 0;

            while(!secondStack.isEmpty()) {
                int testTemp = secondStack.pop();
                count++;
                myStack.push(testTemp);
                if (testTemp > topOfStack) {
                    warmerTemp = count;
                    break;
                }
            }
            
            while (count > 0) {
                secondStack.push(myStack.pop());
                count--;
            }

            secondStack.push(topOfStack);
            myStack.pop();
            output[temperatures.length - i - 1] = warmerTemp;
            i++;
        }

        return output;
    }
}
