class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> myStack = new Stack<>();
        int b;

        for (String token: tokens) {
            switch (token) {
                case "+":
                    myStack.push(myStack.pop() + myStack.pop());
                    break;
                case "-":
                    b = myStack.pop();
                    myStack.push(myStack.pop() - b);
                    break;
                case "*":
                    myStack.push(myStack.pop() * myStack.pop());
                    break;
                case "/":
                    b = myStack.pop();
                    myStack.push(myStack.pop() / b);
                    break;
                default:
                    myStack.push(Integer.valueOf(token));
            }
        }

        return myStack.pop(); 
    }
}
