class MinStack {

    private List<Integer> myStack;

    public MinStack() {
        myStack = new ArrayList<>();
    }
    
    public void push(int val) {
        myStack.add(val);
    }
    
    public void pop() {
        myStack.remove(myStack.size()-1);
    }
    
    public int top() {
        return myStack.get(myStack.size() - 1);
    }
    
    public int getMin() {
        int min = myStack.get(0);
        for (int i=0; i<myStack.size(); i++) {
            min = Math.min(min, myStack.get(i));
        }
        return min;
    }
}
