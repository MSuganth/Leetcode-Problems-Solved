class Solution {
    public int findMaxK(int[] nums) {
          int max = 0;
          Set<Integer> arr = new HashSet<>();
          for(int i : nums){
             if(i < 0) arr.add(i);
          }
          int emax = 0;
          for(int i = 0;i<nums.length;i++){
              if(nums[i]>0){
                if(nums[i] > max) max = nums[i];
                if(arr.contains(max*-1)){
                    if(max > emax) emax = max;
                }
                else max = 0;
              }
          }
          if(emax == 0) return -1;
          return emax;
    }
}