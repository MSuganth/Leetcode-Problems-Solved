class Solution {
    public String reversePrefix(String w, char ch) {
           String rev = "";
           int in = w.length();
           for(int i = 0;i<w.length();i++){
               if(w.charAt(i) == ch){
                  in = i;
                  break;
               }
           }
           if(in == w.length()) return w;
           for(int i = in;i>=0;i--){
               rev += w.charAt(i);
           }
           for(int i = in+1;i<w.length();i++){
              rev += w.charAt(i);
           }

           return rev;
    }
}