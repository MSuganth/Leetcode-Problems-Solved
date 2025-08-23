class Solution {
    public int minSubArrayLen(int target, int[] nums) {
           int min = Integer.MAX_VALUE;
           int l = 0;
           int r = 0;
           int sum = 0;
           while(r < nums.length){
                sum += nums[r];
                while(sum >= target){
                    if( (r-l)+1 < min) min = (r-l)+1;
                    sum -= nums[l];
                    l++;
                }
                r++;
           }
           if(min == Integer.MAX_VALUE) return 0;
           return min;
    } 
}