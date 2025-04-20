class Solution {
    public int[] sortedSquares(int[] nums) {
           int in = 0;
           for(int i:nums) nums[in++] = i*i;
           Arrays.sort(nums);
           return nums;
    }
}