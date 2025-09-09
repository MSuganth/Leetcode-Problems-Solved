class MyHashMap {
    
    List<List<Integer>> arr = new ArrayList<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        boolean f = false;
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i).get(0) == key){
                f = true;
                arr.get(i).set(1,value);
            }
        }
        if(!f){
            List<Integer> t = new ArrayList<>();
            t.add(key);
            t.add(value);
            arr.add(t);
        }
    }
    
    public int get(int key) {
          boolean f = false;
          for(int i = 0;i<arr.size();i++){   
              if(arr.get(i).get(0) == key){
                  f = true;
                  return arr.get(i).get(1);
              }
          }
          if(!f) return -1;
          return 0;
    }
    
    public void remove(int key) {
         boolean f = false;
         for(int i = 0;i<arr.size();i++){
            if(arr.get(i).get(0) == key){
                arr.remove(i);
            }
         }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */