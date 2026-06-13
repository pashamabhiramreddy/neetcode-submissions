class MyHashMap {
    HashMap<Integer,Integer> al;
    public MyHashMap() {
        al=new HashMap<>();    
    }
    
    public void put(int key, int value) {
        al.put(key,value);    
    }
    
    public int get(int key) {
      if (!al.containsKey(key)) {
      return -1;
    }
    return al.get(key);
}
        
        public void remove(int key) {
         al.remove(key); 
    }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */