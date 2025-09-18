class Solution {
    public int countWords(String[] w1, String[] w2) {
           Set<String> set1 = new HashSet<>();
           Set<String> set2 = new HashSet<>();
           Set<String> rem = new HashSet<>();
           int res = 0;
           for(String s:w1){
               if(set1.contains(s)){
                  rem.add(s);
                  set1.remove(s);
               }
               else set1.add(s);
           }
           for(String s:w2){
               if(set2.contains(s)){
                  rem.add(s);
                  set2.remove(s);
               }
               else{
                   if(!(rem.contains(s))) set2.add(s);
               }
           }
           for(String s:set1){
               if(set2.contains(s)) res++;
           }
           return res;
    }
}