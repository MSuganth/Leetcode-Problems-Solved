class Solution {
    public int findLucky(int[] arr) {
           Map<Integer,Integer> map = new HashMap<>();
           for(int i = 0;i<arr.length;i++) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           int max = -1;
           for(int i:map.keySet()) if(map.get(i) == i) if(i>max) max = i;
           return max;
    }
}