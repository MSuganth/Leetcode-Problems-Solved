class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
          Set<Integer> n1 = new HashSet<>();
          Set<Integer> n2 = new HashSet<>();
          Set<Integer> n3 = new HashSet<>();
          for(int i = 0;i<nums1.length;i++){
               n1.add(nums1[i]);
          }
          for(int i = 0;i<nums2.length;i++){
               n2.add(nums2[i]);
          }
          for(int i = 0;i<nums3.length;i++){
             n3.add(nums3[i]);
          }
          Set<Integer> res = new HashSet<>();
          for(int i : n1){
             if(n2.contains(i)){
                if(n3.contains(i)) res.add(i);
                else res.add(i);
             }
             else if(n3.contains(i)) res.add(i);
          }
          for(int i:n2){
             if(n3.contains(i)) res.add(i);
          }
          List<Integer> arr = new ArrayList<>();
          for(int i:res){
              arr.add(i);
          }
          return arr;
    }
}