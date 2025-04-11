class Solution {
    public int uniqueMorseRepresentations(String[] words) {
           String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
           String alpha = "abcdefghijklmnopqrstuvwxyz";
           Set<String> res = new HashSet<>();
           for(int i = 0;i<words.length;i++){
               String t = "";
               for(int j = 0;j<words[i].length();j++){
                   int in = alpha.indexOf(words[i].charAt(j));
                   t += code[in];
               }
               res.add(t);
           }
           return res.size();
    }
}