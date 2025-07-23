class Solution {
    public static boolean check(String s){
          Set<Character> set = new HashSet<>();
          for(char ch:s.toCharArray()) set.add(ch);
          if(set.size() == s.length()) return true;
          return false;
    }
    public int countGoodSubstrings(String s) {
           int count = 0;
           for(int i=0;i<=s.length()-3;i++){
               if(check(s.substring(i,i+3))) count++;
           }
           return count;
    }
}