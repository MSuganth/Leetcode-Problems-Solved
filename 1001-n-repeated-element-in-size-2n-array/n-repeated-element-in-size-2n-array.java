class Solution {
    public int repeatedNTimes(int[] nums) {
           Set<Integer> uni = new HashSet<>();
           for(int i = 0;i<nums.length;i++){
               if(uni.contains(nums[i])) return nums[i];
               uni.add(nums[i]);
           }
           return 0;
    }
}