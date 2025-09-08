class Solution {
    public static boolean con(int n){
          while( n != 0){
              if( n%10 == 0) return false;
              n/=10;
          }
          return true;
    }
    public int[] getNoZeroIntegers(int n) {
           for(int i = 1;i<=n;i++){
                 int b = n-i;
                 if(con(i) && con(b)) return (new int[]{i,b});
           }
           return new int[]{0,0};

    }
}