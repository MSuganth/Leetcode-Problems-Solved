class Solution {
    public int returnToBoundaryCount(int[] nums) {
          int step = 0;
          int c = 0;
          for(int i=0;i<nums.length;i++){
              step = step + nums[i];
              if(step == 0) c++;
          }
          return c;
    }
}