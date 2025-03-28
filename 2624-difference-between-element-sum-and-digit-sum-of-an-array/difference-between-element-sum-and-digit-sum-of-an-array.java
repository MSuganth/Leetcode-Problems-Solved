class Solution {
    public int differenceOfSum(int[] nums) {
          int esum = 0;
          int dsum = 0;
          for(int i = 0;i<nums.length;i++){
             if(nums[i] >= 10){
                esum += nums[i];
                int n = nums[i];
                while(n>0){
                    dsum += n%10;
                    n/=10;
                }
             }
             else{
                esum += nums[i];
                dsum += nums[i];
             }
          }
          return Math.abs(esum-dsum);
    }
}