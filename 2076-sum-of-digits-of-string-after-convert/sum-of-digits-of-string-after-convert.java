class Solution {
    public int getLucky(String s, int k) {
           StringBuilder t = new StringBuilder();
           for(int i = 0;i<s.length();i++){
               int t1 = (int)s.charAt(i) - 96;
               t.append(t1+"");
           }
           String res = t.toString();
           for(int j = 1;j<=k;j++){
               int sum = 0;
               for(int i = 0;i<res.length();i++){
                   sum += (res.charAt(i) - '0');
               }
               res = String.valueOf(sum);
           }
           return Integer.valueOf(res);
    }
}