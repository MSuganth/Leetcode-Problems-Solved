class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int o = 0;
        int sum = 0;
        for(int i:nums){
              if(set.contains(i)) o = i;
              else{
                sum += i;
                set.add(i);
              }
        }
        int total = (n*(n+1))/2;
        int s = total - sum;
        return new int[]{o,s};
    }
}