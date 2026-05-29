class MinStack {

    private List<Integer> myStack;
    private List<Integer> minList;
    int currMin;

    public MinStack() {
        myStack = new ArrayList<>();
        minList = new ArrayList<>();
        currMin = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        myStack.add(val);
        currMin = Math.min(currMin, val);
        minList.add(currMin);
    }
    
    public void pop() {
        myStack.remove(myStack.size()-1);
        minList.remove(minList.size()-1);
        if (minList.size() == 0 ) {currMin = Integer.MAX_VALUE; return;}
        currMin = minList.get(minList.size() - 1);
    }
    
    public int top() {
        return myStack.get(myStack.size() - 1);
    }
    
    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
