class Solution {
    public int[] sortEvenOdd(int[] nums) {
           List<Integer> e = new ArrayList<>();
           List<Integer> o = new ArrayList<>();
           for(int i=0;i<nums.length;i++){
               if(i%2 == 0) e.add(nums[i]);
               else o.add(nums[i]);
           }
           Collections.sort(e);
           Collections.sort(o);
           int in = 0;
           for(int i = 0;i<e.size();i++){
               nums[in] = e.get(i);
               in = in + 2;
           }
           in = 1;
           for(int i = o.size()-1;i>=0;i--){
               nums[in] = o.get(i);
               in = in + 2;
           }
           return nums;

    }
}