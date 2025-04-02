class Solution {
    public int[] intersection(int[] n1, int[] n2) {
          ArrayList<Integer> num1 = new ArrayList<>();
          ArrayList<Integer> num2 = new ArrayList<>();
          ArrayList<Integer> a = new ArrayList<>();
          for(int i = 0;i<n1.length;i++){
              num1.add(n1[i]);
          }
          for(int i = 0;i<n2.length;i++){
              num2.add(n2[i]);
          }
          for(int i = 0;i<num1.size();i++){
              if(num2.contains(num1.get(i))){
                if(!a.contains(num1.get(i))) a.add(num1.get(i));
              }
          }
          int[] ans = new int[a.size()];
          for(int i = 0;i<a.size();i++){
              ans[i] = a.get(i);
          }
          return ans;
    }
}