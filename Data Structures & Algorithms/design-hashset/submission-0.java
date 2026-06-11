class MyHashSet {
    HashSet<Integer> al;

    public MyHashSet() {
      al=  new HashSet<>();
        
    }
    
    public void add(int key) {
        al.add(key);
    }
    
    public void remove(int key) {
        al.remove(key);
        
    }
    
    public boolean contains(int key) {
         return al.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */