class Solution {
    public int alternateDigitSum(int n) {
           if(n == 0) return 0;
           int l = String.valueOf(n).length()-1;
           int[] digit = new int[l+1];
           int in = l;
           int sum = 0;
           while(n>0){
               digit[in] = n%10;
               in--;
               n/=10;
           }
           in = 0;
           while(in<=l){
                if(in%2 != 0) sum += digit[in]*-1;
                else sum += digit[in];
                in++;
           }
           return sum;
    }
}