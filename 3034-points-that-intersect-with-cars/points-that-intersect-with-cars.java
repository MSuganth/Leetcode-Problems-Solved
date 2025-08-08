class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
           Set<Integer> set = new HashSet<>();
           for(int i = 0;i<nums.size();i++){
               int l = nums.get(i).get(0);
               int r = nums.get(i).get(1);
               for(int j=l;j<=r;j++) set.add(j);
           }
           return set.size();
    }
}