class Solution {
    public static boolean pali(String s){
           int l = 0;
           int r = s.length()-1;
           while(l<r){
                if(s.charAt(l) != s.charAt(r)) return false;
                l++;
                r--;
           }
           return true;

    }
    public String longestPalindrome(String s) {
           int max = 0;
           String res = "";
           for(int i = 0;i<s.length();i++){
               for(int j = i;j<s.length();j++){
                   String t = s.substring(i,j+1);
                   if(t.charAt(0) == t.charAt(t.length()-1)){
                       if(pali(t)){
                            if(t.length()>max){
                               max = t.length();
                               res = t;
                            }
                        }
                   }
               }
           }
           return res;
    }
}