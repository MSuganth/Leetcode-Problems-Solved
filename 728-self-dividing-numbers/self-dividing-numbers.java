class Solution {
    public static boolean divide(int n){
           int num = n;
           while(n>0){
               int t = n%10;
               if(t == 0) return false;
               if(num%t != 0) return false; 
               n/=10;
           }
           return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
         ArrayList<Integer> arr = new ArrayList<>();
         for(int i = left;i<=right;i++){
             if(divide(i)) arr.add(i);
         }
         return arr;
    }
}