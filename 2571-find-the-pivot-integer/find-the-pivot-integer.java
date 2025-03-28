class Solution {
    public int pivotInteger(int n) {
         int total = 0;
         int left = 0;
         int right = 0;
         for(int i = 1;i<=n;i++){
            total += i;
         }
         for(int i = 1;i<=n;i++){
             right = total - left;
             left += i;
             if(left == right) return i;
         }
         return -1;
    }
}