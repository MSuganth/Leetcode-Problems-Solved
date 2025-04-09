class Solution {
    public int numOfPairs(String[] nums, String target) {
          int count = 0;
          for(int i = 0;i<nums.length;i++){
              if(target.contains(nums[i])){
                  for(int j = 0;j<i;j++){
                     String t = nums[i]+nums[j];
                     if(t.equals(target)) count++;
                  }
                  for(int j = i+1;j<nums.length;j++){
                      String t = nums[i]+nums[j];
                      if(t.equals(target)) count++;
                  }
              }
          }
          return count;
    }
}