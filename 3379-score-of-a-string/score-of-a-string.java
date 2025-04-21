class Solution {
    public int scoreOfString(String s) {
           int sum = 0;
           for(int i = 0;i<s.length()-1;i++){
              int t1 = (int) s.charAt(i);
              int t2 = (int) s.charAt(i+1); 
              sum += Math.abs(t1-t2);
           }
           return sum;
    }
}