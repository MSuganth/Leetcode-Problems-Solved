class Solution {
    public boolean isIsomorphic(String s, String t) {
           Set <Character> set1 = new LinkedHashSet<>();
           Set <Character> set2 = new LinkedHashSet<>();
           Map<Character,Character> map = new LinkedHashMap<>();
           for(char ch:s.toCharArray()) set1.add(ch);
           for(char ch:t.toCharArray()) set2.add(ch);
           if(set1.size() == set2.size()){
              List<Character> l1 = new ArrayList<>();
              List<Character> l2 = new ArrayList<>();
              for(char ch:set1) l1.add(ch);
              for(char ch:set2) l2.add(ch);
              for(int i = 0;i<l1.size();i++) map.put(l1.get(i),l2.get(i));
              StringBuilder res = new StringBuilder();
              for(char ch:s.toCharArray()){
                 res.append(map.get(ch));
              }
              if(t.equals(res.toString())) return true;
              return false;
           }
           return false;
    }
}