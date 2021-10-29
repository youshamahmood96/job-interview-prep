class MinStack {
    private LinkedList<Integer> list;
    private LinkedList<Integer> min;
    public MinStack() {
        list = new LinkedList<Integer>();
        min = new LinkedList<Integer>();
    }
    
    public void push(int val) {
      if(this.min.size() == 0){
        this.min.add(val);
      }
      else if(val<=this.min.getFirst()){
        this.min.add(0,val);
      }
       this.list.addFirst(val);
    }
    
     public void pop() {
        int val = this.list.remove();
        int idx = this.min.indexOf(val);
        if(this.min.size() >0 && this.min.getFirst() == val ){
          this.min.remove(idx);
        }
    }
    
    public int top() {
        return this.list.getFirst();
    }
    
    public int getMin() {
        System.out.println(this.min.toString());
        return this.min.getFirst();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
