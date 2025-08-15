class Solution {
    public int singleNumber(int[] nums) {
           if(nums.length == 1) return nums[0];
           Arrays.sort(nums);
           int i = 0;
           int c = 1;
           while(i<nums.length){
                 if(i == nums.length-1){
                    if(nums[i-1] != nums[i]) return nums[i];
                 }
                 else if(nums[i] != nums[i+1]){
                    if(c == 1) return nums[i];
                    else c = 1;
                 }
                 else c++;
                 i++;
           }
           return 0;
    }
}