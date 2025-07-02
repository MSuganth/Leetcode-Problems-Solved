class Solution {
    public int bitwiseComplement(int n) {
          if(n ==0) return 1;
          StringBuilder s = new StringBuilder();
          while(n!=0){
               if(n%2 == 0) s.append('1');
               else s.append('0');
               n=n/2;
          }
          s.reverse();
          int p = 0;
          int sum = 0;
          for(int i = s.length()-1;i>=0;i--){
              if(s.charAt(i) != '0'){
                 sum = sum + (int) Math.pow(2,p);
              }
              p++;
          }
          return sum;
    }
}