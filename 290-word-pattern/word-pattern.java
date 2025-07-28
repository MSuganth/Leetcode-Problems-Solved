class Solution {
    public boolean wordPattern(String p, String s) {
           String[] arr = s.split(" ");
           Set<Character> s1 = new LinkedHashSet<>();
           Set<String> s2 = new LinkedHashSet<>();
           for(String t:arr) s2.add(t);
           for(char ch:p.toCharArray()) s1.add(ch);
           if(s1.size() == s2.size()){
              Map<String,Character> map = new LinkedHashMap<>();
              List<Character> l1 = new ArrayList<>();
              List<String> l2 = new ArrayList<>();
              for(String t:s2) l2.add(t);
              for(char ch:s1) l1.add(ch);
              for(int i=0;i<l2.size();i++) map.put(l2.get(i),l1.get(i));
              StringBuilder res = new StringBuilder();
              for(String t:arr) res.append(map.get(t));
              if(p.equals(res.toString())) return true;
              return false;
           }
           return false;
    } 
}