class Solution {
    public int reverseDegree(String s) {
           String alpha = "zyxwvutsrqponmlkjihgfedcba";
           int total = 0;
           for(int i = 0;i<s.length();i++){
               int rev = alpha.indexOf(s.charAt(i)) + 1;
               rev = rev * (i+1);
               total += rev;
           }
           return total;
    }
}