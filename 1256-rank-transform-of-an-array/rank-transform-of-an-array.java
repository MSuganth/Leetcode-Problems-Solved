class Solution {
    public int[] arrayRankTransform(int[] arr) {
           int[] sarr = new int[arr.length];
           for(int i = 0;i<arr.length;i++) sarr[i] = arr[i];
           Arrays.sort(sarr);
           Set<Integer> set = new LinkedHashSet<>();
           Map<Integer,Integer> rank = new HashMap<>();
           for(int i: sarr) set.add(i);
           int r = 1;
           for(int i:set){
               rank.put(i,r);
               r++;
           }
           for(int i = 0;i<arr.length;i++) arr[i] = rank.get(arr[i]);
           return arr;
    }
}