class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
           int n1 = nums.length;
           int n2 = index.length;
           int[] res = new int[n1];
           for(int i = 0;i<n1;i++){
               res[i] = -1;
           }
           for(int i = 0;i<n1;i++){
               int[] t = new int[n1];
               for(int j = 0;j<n1;j++) t[j] = res[j]; 
               if(res[index[i]] == -1) res[index[i]] = nums[i];
               else{
                   for(int j = index[i]+1;j<n1;j++){
                        t[j] = res[j-1];
                   }
                   t[index[i]] = nums[i];
                   res = t;
               }
           }
           return res;
    }
}