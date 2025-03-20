class Solution {
    public String capitalizeTitle(String t) {
         t = t.toLowerCase();
         String[] str = t.split(" ");
         String st = "";
         for(String i :str){
             if(i.length() >2){
                 int te = i.charAt(0)-32;
                 String temp = (char) te + i.substring(1);
                 st = st + temp + " ";
             }
             else st = st + i + " ";
         }
         String out = "";
         for(int i = 0;i<st.length();i++){
             if(i != st.length()-1) out += st.charAt(i);
         }
         return out;
    }
}