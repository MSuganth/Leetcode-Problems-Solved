class Solution {
    public int countWords(String[] w1, String[] w2) {
           List<String> a1 = Arrays.asList(w1);
           List<String> a2 = Arrays.asList(w2);
           int count = 0;
           for(String i : a1){
              int f1 = Collections.frequency(a1,i);
              int f2 = Collections.frequency(a2,i);
              if(f1 == 1 && f2 == 1) if(f1 == f2) count++; 
           }
           return count;
    }
}