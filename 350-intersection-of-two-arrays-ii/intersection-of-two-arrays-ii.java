class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
           int l1 = nums1.length;
           int l2 = nums2.length;
           List<Integer> res = new ArrayList<>();
           if(l1 > l2){
               List<Integer> arr = new ArrayList<>();
               for(int i:nums1) arr.add(i);
               for(int i:nums2){
                  if(arr.contains(i)){
                     arr.remove(Integer.valueOf(i));
                     res.add(i);
                  }
               }
           }
           else{
               List<Integer> arr = new ArrayList<>();
               for(int i:nums2) arr.add(i);
               for(int i:nums1){
                  if(arr.contains(i)){
                     arr.remove(Integer.valueOf(i));
                     res.add(i);
                  }
               }
           }
           int[] rest = new int[res.size()];
           for(int i = 0;i<res.size();i++) rest[i] = res.get(i);
           return rest;
    }
}