class NumArray {
    int[] p;
    public NumArray(int[] nums) {
          int[] p = new int[nums.length];
          p[0] = nums[0];
          int sum = nums[0];
          for(int i = 1;i<nums.length;i++){
             sum += nums[i];
             p[i] = sum;
          }
          this.p = p;
    }
    
    public int sumRange(int left, int right) {
          if(left == 0) return p[right];
          return p[right]-p[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */