class Solution {
    public static int binary(int n){
         int c = 0;
         while(n != 0){
             if(n%2 == 1) c++;
             n = n/2;
         }
         return c;
    }
    public int[] countBits(int n) {
           int[] res = new int[n+1];
           res[0] = 0;
           for(int i = 1;i<=n;i++){
               res[i] = binary(i);
           }
           return res;
    }
}