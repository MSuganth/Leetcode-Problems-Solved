class Solution {
    public String removeTrailingZeros(String num) {
          int s = 0;
          int r = 0;
          int i = 0;
          while(num.charAt(i) == '0'){
               s++;
               i++;
          }
          i = num.length()-1;
          while(num.charAt(i) == '0'){
               r++;
               i--;
          }
          return num.substring(s,num.length()-r);
    }
}