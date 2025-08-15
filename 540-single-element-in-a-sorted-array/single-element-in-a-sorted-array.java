class Solution {
    public int singleNonDuplicate(int[] nums) {
          if(nums.length == 1) return nums[0];
          int i = 0;
          int c = 1;
          while(i<nums.length){
                if(i == nums.length-1){
                    if(nums[i-1] != nums[i]) return nums[i];
                }
                if(nums[i] != nums[i+1]){
                    if(c == 1) return nums[i];
                    else c = 1;
                } 
                else c++;
                i++;       
          }
          return 0;
    }
}