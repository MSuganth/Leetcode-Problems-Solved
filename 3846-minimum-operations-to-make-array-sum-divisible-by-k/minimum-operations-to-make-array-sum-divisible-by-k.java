class Solution {
    public int minOperations(int[] nums, int k) {
         int sum = 0;
         int min = 0;
         for(int i:nums) sum+=i;
         if(sum%k == 0) return 0;
         boolean f = true;
         while(f){
            if(sum%k == 0) return min;
            min++;
            sum--;
         }
         return min;
    }
}