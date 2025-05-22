class Solution {
    public int maxFreqSum(String s) {
      Map<Character,Integer> c = new HashMap<>();
      Map<Character,Integer> v = new HashMap<>();
      for(int i = 0;i<s.length();i++){
         char t = s.charAt(i);
         if(t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') v.put(t,v.getOrDefault(t,0)+1);
         else c.put(t,c.getOrDefault(t,0)+1);
      }
      int maxc = 0;
      int maxv = 0;
      for(char ch:v.keySet()) if(v.get(ch) > maxv) maxv = v.get(ch);
      for(char ch:c.keySet()) if(c.get(ch) > maxc) maxc = c.get(ch);
      return maxv+maxc;
    }
}