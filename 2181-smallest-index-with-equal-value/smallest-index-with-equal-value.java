class Solution {
    public int smallestEqual(int[] nums) {
          int min = nums.length-1;
          boolean f = false;
          for(int i = 0;i<nums.length;i++){
              if(i%10 == nums[i]){
                 f = true;
                 if(i < min) min = i;
              }
          }
          return f? min:-1;
    }
}