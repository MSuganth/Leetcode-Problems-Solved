class Solution {
    public String generateTag(String c) {
            c = c.trim();
            StringBuilder res = new StringBuilder();
            res.append("#");
            int i = 0;
            while(i < c.length() && c.charAt(i) != ' '){
                 if(res.length() == 100) break;
                 if(i == 0){
                    char ch = Character.toLowerCase(c.charAt(i));
                    res.append(ch);
                 }
                 else{
                    char ch = Character.toLowerCase(c.charAt(i));
                    res.append(ch);
                 }
                 i++;
            }
            while(i < c.length()){
                  if(res.length() == 100) break;
                  char ch = c.charAt(i);
                  if(ch != ' '){
                      if(c.charAt(i-1) == ' '){
                          if(Character.isLowerCase(ch)) res.append(Character.toUpperCase(ch));
                          else res.append(ch);
                       }
                       else{
                           if(Character.isUpperCase(ch)) res.append(Character.toLowerCase(ch));
                           else res.append(ch);
                       }
                   }
                   i++;
             }
             return res.toString();
    }
}