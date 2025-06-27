class Solution {
    public int[] shuffle(int[] nums, int n) {
           int[] arr = new int[nums.length];
           int in = 0;
           for(int i = 0;i<n;i++){
              arr[in] = nums[i];
              in=in+2;
           }
           in = 1;
           for(int i = n;i<nums.length;i++){
                arr[in] = nums[i];
                in=in+2;
           }
           return arr;
    }
}