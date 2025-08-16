class Solution {
    public int maximum69Number (int num) {
          int max = num;
          StringBuilder str = new StringBuilder(String.valueOf(num));
          for(int i = 0;i<str.length();i++){
              if(str.charAt(i) == '9'){
                  str.setCharAt(i,'6');
                  int t = Integer.valueOf(str.toString());
                  if(t >  max) max = t;
                  str.setCharAt(i,'9');
              }
              else{
                 str.setCharAt(i,'9');
                  int t = Integer.valueOf(str.toString());
                  if(t >  max) max = t;
                  str.setCharAt(i,'6');
              }
          }
          return max;
    }
}