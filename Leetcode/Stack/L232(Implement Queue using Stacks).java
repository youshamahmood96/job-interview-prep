class MyQueue {
    Stack<Integer> pushStack;
    Stack<Integer> popStack;
    public MyQueue() {
        pushStack = new Stack<>();
        popStack  = new Stack<>();
    }
    
    public void push(int x) {
        while(!popStack.isEmpty()){
            pushStack.push(popStack.pop());
        }
        pushStack.push(x);
    }
    
    public int pop() {
        while(!pushStack.isEmpty()){
            popStack.push(pushStack.pop());
        }
        return popStack.pop();
    }
    
    public int peek() {
          while(!pushStack.isEmpty()){
            popStack.push(pushStack.pop());
        }
        return popStack.peek();
    }
    
    public boolean empty() {
        return (pushStack.isEmpty() && popStack.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
