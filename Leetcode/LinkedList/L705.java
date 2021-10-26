class MyHashSet {
    private LinkedList<Integer> set = new LinkedList<Integer>();
    public MyHashSet() {

    }

     public void add(int key) {
        if(!(this.set.contains(key)))
        this.set.add(key);
    }

    public void remove(int key) {
        int index = this.set.indexOf(key);
        if(index>=0){
            this.set.remove(index);
        }
    }

    public boolean contains(int key) {
        return this.set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
