class Solution {
    public int[] rearrangeArray(int[] nums) {
           int l = nums.length/2;
           int[] evenarr = new int[l];
           int[] oddarr = new int[l];
           int[] res = new int[nums.length];
           int in = 0;
           int ind = 1;
           for(int i = 0;i<nums.length;i++){
               if(nums[i]>0){
                 res[in] = nums[i];
                 in = in+2;
               }
               else{
                  res[ind] = nums[i];
                  ind = ind + 2;
               }
           }
           return res;
    }
}