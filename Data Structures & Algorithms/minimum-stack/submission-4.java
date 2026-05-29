class MinStack {

    private Stack<Integer> myStack;
    private Stack<Integer> minStack;
    int currMin;

    public MinStack() {
        myStack = new Stack<>();
        minStack = new Stack<>();
        currMin = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        myStack.push(val);
        currMin = Math.min(currMin, val);
        minStack.push(currMin);
    }
    
    public void pop() {
        myStack.pop();
        minStack.pop();
        if (minStack.size() > 0) {
            currMin = minStack.peek();
        } else {
            currMin = Integer.MAX_VALUE;
        }
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
