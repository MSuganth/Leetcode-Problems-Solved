class Solution {
    public boolean checkDistances(String s, int[] d) {
           boolean[] b = new boolean[s.length()];
           for(int i = 0;i<s.length();i++){
               if(b[i]) continue;
               int j = i+1;
               while(j<s.length()){
                   if(s.charAt(i) == s.charAt(j)){
                      b[j] = true;
                      break;
                   }
                   j++;
               }
               int t1 = (int) s.charAt(i);
               if(!(d[t1-97] == (j-i-1))) return false;
           }
           return true;
    }
}