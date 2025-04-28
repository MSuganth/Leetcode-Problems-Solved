class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
           int c = 0;
           int[] res = new int[nums.length];
           int in = 0;
           for(int i = 0;i<nums.length;i++){
               c = 0;
               for(int j = 0;j<nums.length;j++){
                  if(i != j) if(nums[j]<nums[i]) c++;
               }
               res[in++] = c;
           }
           return res;
    }
}