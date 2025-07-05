class Solution {
    public int findLucky(int[] arr) {
           Map<Integer,Integer> map = new HashMap<>();
           for(int i=0;i<arr.length;i++){
               map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }
           int max = 0;
           for(int i:map.keySet()){
              if(i == map.get(i)){
                  if(i>max) max = i;
              }
           }
           if(max == 0) return -1;
           return max;
    }
}