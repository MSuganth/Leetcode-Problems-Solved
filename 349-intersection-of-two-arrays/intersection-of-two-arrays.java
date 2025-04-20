class Solution {
    public int[] intersection(int[] n1, int[] n2) {
          Set<Integer> num1 = new HashSet<>();
          Set<Integer> num2 = new HashSet<>();
          List<Integer> a = new ArrayList<>();
          for(int i:n1) num1.add(i);
          for(int i:n2) num2.add(i);
          for(int i:num2){
             if(num1.contains(i)) a.add(i);
          }
          int[] res = new int[a.size()];
          int in = 0;
          for(int i:a) res[in++] = i;
          return res;
    }
}