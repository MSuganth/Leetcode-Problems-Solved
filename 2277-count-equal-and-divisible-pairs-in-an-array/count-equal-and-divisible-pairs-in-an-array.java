class Solution {
    public int countPairs(int[] nums, int k) {
           int i = 0;
           int n = nums.length;
           int res = 0;
           while(i<n){
                int j = i+1;
                while(j<n){
                    if( nums[i] == nums[j] && ((i*j)%k == 0)) res++;
                    j++;
                }
                i++;
           }
           return res;
    }
}