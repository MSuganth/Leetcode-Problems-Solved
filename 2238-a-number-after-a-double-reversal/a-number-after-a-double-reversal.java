class Solution {
    public boolean isSameAfterReversals(int num) {
         int n = num;
         int reverse = 0;
         while(num>0){
             reverse = (reverse*10) + num%10;
             num/=10;
         }
         String s = String.valueOf(reverse);
         String s1 = String.valueOf(n);
         return s.length()==s1.length()? true:false;
    }
}