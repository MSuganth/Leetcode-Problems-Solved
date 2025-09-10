class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int[] res = new int[2];
        int sum = 0;
        for(int i:nums){
              if(set.contains(i)) res[0] = i;
              else{
                sum += i;
                set.add(i);
              }
        }
        int total = (n*(n+1))/2;
        res[1] = total - sum;
        return res;
    }
}