class Solution {
    public int[] intersection(int[] n1, int[] n2) {
          ArrayList<Integer> num1 = new ArrayList<>();
          ArrayList<Integer> a = new ArrayList<>();
          for(int i = 0;i<n1.length;i++){
              num1.add(n1[i]);
          }
          for(int i = 0;i<n2.length;i++){
              if(num1.contains(n2[i])){
                if(!a.contains(n2[i])) a.add(n2[i]);
              }
          }
          int[] ans = new int[a.size()];
          for(int i = 0;i<a.size();i++){
              ans[i] = a.get(i);
          }
          return ans;
    }
}