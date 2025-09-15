class Solution {
    public int divisorSubstrings(int num, int k) {
           String s = String.valueOf(num);
           int i = 0;
           int res = 0;
           while(i<=(s.length()-k)){
                 int t = Integer.valueOf(s.substring(i,i+k));
                 if(t != 0){
                    if(num%t == 0) res++;
                 }
                 i++;
           }
            return res;
    }
}