class Solution {
    public int lengthOfLastWord(String s) {
           s = s.trim();
           StringBuilder res = new StringBuilder();
           for(int i=s.length()-1;i>=0;i--){
               if(s.charAt(i) == ' ') break;
               res.append(s.charAt(i));
           }
           return res.length();
    }
}