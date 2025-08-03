class Solution {
    public int[] minCosts(int[] cost) {
           int min = cost[0];
           int[] res = new int[cost.length];
           for(int i = 0;i<cost.length;i++){
               if(cost[i]<min){
                  min = cost[i];
                  res[i] = min;
               }
               else res[i] = min;
           }
           return res;
    }
}