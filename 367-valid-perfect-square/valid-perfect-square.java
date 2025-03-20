class Solution {
    public boolean isPerfectSquare(int num) {
         if(num == 1) return true;
         int i = 1;
         int n = num/2;
         while(i <= n) {
             if((i*i) == num) return true;
             i++;
             
         }
         return false;
    }
}