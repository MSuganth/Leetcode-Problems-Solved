class Solution {
    public boolean isThree(int n) {
          int d = 0;
          for(int i = 1;i<=n;i++){
             if(n%i == 0) d++;
          }
          if(d == 3) return true;
          return false;
    }
}