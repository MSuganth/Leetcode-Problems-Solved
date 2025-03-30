class Solution {
    public boolean canAliceWin(int n) {
         if(n < 10) return false;
         int total = 10;
         while(n >= 0){
            if(n-total < 0 && total%2 != 0) return true;
            n = n - total;
            total--;
         }
         return false;
    }
}