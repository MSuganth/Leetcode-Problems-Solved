class Solution {
    public boolean checkDistances(String s, int[] d) {
           boolean[] b = new boolean[26];
           for(int i = 0;i<s.length();i++){
               int t1 = (int) s.charAt(i);
               if(b[t1-97]) continue;
               int j = i+1;
               while(j<s.length()){
                   if(s.charAt(i) == s.charAt(j)){
                      break;
                   }
                   j++;
               }
               b[t1-97] = true;
               if(!(d[t1-97] == (j-i-1))) return false;
           }
           return true;
    }
}