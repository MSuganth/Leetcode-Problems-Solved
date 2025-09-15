class Solution {
    public String reverseOnlyLetters(String s) {
           char[] arr = s.toCharArray();
           int l = 0;
           int r = arr.length-1;
           while(l<=r){
                int t1 = (int) arr[l];
                int t2 = (int) arr[r];
                if( ((t1>=65&&t1<=90)||(t1>=97&&t1<=122)) && ((t2>=65&&t2<=90)||(t2>=97&&t2<=122)) ){
                      char ch = arr[l];
                      arr[l] = arr[r];
                      arr[r] = ch;
                      l++;
                      r--;
                }
                else{
                     if( !((t1>=65&&t1<=90)||(t1>=97&&t1<=122)) && !((t2>=65&&t2<=90)||(t2>=97&&t2<=122)) ){
                           l++;
                           r--;
                     }
                     else{
                         if( !((t2>=65&&t2<=90)||(t2>=97&&t2<=122)) ) r--;
                         else l++;
                     }
                }
           }
           StringBuilder res = new StringBuilder();
           for(char ch:arr) res.append(ch);
           return res.toString();
    }
}