class Solution {
    public String convertToTitle(int n) {
           StringBuilder res = new StringBuilder();
           while(n>0){
                n = n-1;
                int r = n%26;
                res.append((char)('A'+r));
                n=n/26;
           }
           return res.reverse().toString();
    }
}