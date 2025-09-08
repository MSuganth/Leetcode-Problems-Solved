class Solution {
    public static boolean con(int n){
          while( n != 0){
              if( n%10 == 0) return false;
              n/=10;
          }
          return true;
    }
    public int[] getNoZeroIntegers(int n) {
           int[] res = new int[2];
           for(int i = 1;i<=n;i++){
               if(con(i)){
                  for(int j = 1;j<=(n-i);j++){
                      if(con(j)){
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