class MyHashSet {

     private int SIZE = 749;
      private List<Integer>[] buckets;
    public MyHashSet() {
        buckets = new List[SIZE];
        for(int i = 0 ; i < SIZE; i++){
           List<Integer> bucket = new ArrayList();
           buckets[i] = bucket;
        }

    }
    
    public void add(int key) {
        int hashValue = key % SIZE;
        List<Integer> bucket = buckets[hashValue];
        if(bucket.contains(key) == false){
            bucket.add(key);
        }
        
    }
    
    public void remove(int key) {
         int hashValue = key % SIZE;
        List<Integer> bucket = buckets[hashValue];
        bucket.remove(Integer.valueOf(key));
        
    }
    
    public boolean contains(int key) {
          int hashValue = key % SIZE;
        List<Integer> bucket = buckets[hashValue];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */