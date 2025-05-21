class Solution {
    public int[] applyOperations(int[] nums) {
          int i = 0;
          while(i < nums.length-1){
             if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
             }
             i++;
          }
          int j = 0;
          i = 0;
          while(i < nums.length){
                if(nums[i] != 0){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    j++;
                }
                i++;
          }
          return nums;
    }
}