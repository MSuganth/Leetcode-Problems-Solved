class Solution {
    public boolean digitCount(String num) {
           int[] fre = new int[10];
           for(int i = 0;i<num.length();i++){
               int t = num.charAt(i)-'0';
               fre[t]++;
           }
           for(int i = 0;i<num.length();i++){
                int t = num.charAt(i)-'0';
                if(fre[i] != t) return false;
           }
           return true;
    }
}