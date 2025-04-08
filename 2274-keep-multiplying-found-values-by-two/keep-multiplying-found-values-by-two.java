class Solution {
    public int findFinalValue(int[] nums, int o) {
           for(int i = 0;i<nums.length;i++){
               if(nums[i] == o){
                  o = o * 2;
                  i = -1;
               }
           }
           return o;
    }
}