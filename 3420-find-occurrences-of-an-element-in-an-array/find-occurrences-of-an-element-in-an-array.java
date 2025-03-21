class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
           int count = 0;
           ArrayList<Integer>  a = new ArrayList<>();
           for(int i = 0;i<nums.length;i++){
               if(nums[i] == x){
                  count++;
                  a.add(i);
               }
           }
           for(int i = 0;i<q.length;i++){
               if(q[i] <= count){
                  q[i] = a.get(q[i]-1);
               }
               else q[i] = -1;
           }
           return q;
    }
}