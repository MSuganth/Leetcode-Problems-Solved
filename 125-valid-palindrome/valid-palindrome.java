class Solution {
    public boolean isPalindrome(String s) {
           StringBuilder res = new StringBuilder();
           for(int i=0;i<s.length();i++){
                int t = (int) s.charAt(i);
                if(s.charAt(i) == ' ') continue;
                if((t>=33 && t<=47) || (t>=58&&t<=64) || (t>=91&&t<=96) || (t>=123&&t<=126)) continue;
                if(t>=65 && t<=90){
                    t = t + 32;
                    res.append((char) t);
                }
                else res.append(s.charAt(i));
           }
           int l=0;
           int r=res.length()-1;
           while(l<r){
               if(!(res.charAt(l)==res.charAt(r))) return false;
               l++;
               r--;
           }
           return true;
    }
}