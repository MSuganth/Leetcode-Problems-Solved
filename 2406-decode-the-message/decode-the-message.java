class Solution {
    public String decodeMessage(String key, String message) {
          String uni = "";
           String alpha = "abcdefghijklmnopqrstuvwxyz";
           for(int i = 0;i<key.length();i++){
               String temp = "";
               temp += key.charAt(i);
               if(!uni.contains(temp) && key.charAt(i) != ' ') uni += key.charAt(i);
           }
           String res = "";
           for(int i = 0;i<message.length();i++){
               if(message.charAt(i) != ' '){
                 int in = uni.indexOf(message.charAt(i));
                 res += alpha.charAt(in);
               }
               else res += message.charAt(i);
           }
           return res;
    }
}