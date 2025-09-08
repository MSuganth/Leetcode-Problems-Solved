class Solution {
    public int[] getNoZeroIntegers(int n) {
           int[] res = new int[2];
           for(int i = 1;i<=n;i++){
               if(String.valueOf(i).indexOf('0') == -1){
                  for(int j = 1;j<=(n-i);j++){
                      if( String.valueOf(j).indexOf('0') == -1){
                         if( i+j == n){
                             res[0] = i;
                             res[1] = j;
                             return res;
                         }
                      }
                  }
               }
           }
           return res;
    }
}