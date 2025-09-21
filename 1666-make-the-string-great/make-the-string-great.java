class Solution {
    public String makeGood(String s) {
           boolean c = true;
           while(c){
                StringBuilder t = new StringBuilder(s);
                boolean f = false;
                for(int i = 0;i<t.length()-1;i++){
                     int t1 = (int) t.charAt(i);
                     int t2 = (int) t.charAt(i+1);
                     if( (t1-32) == t2){
                          f = true;
                          t.deleteCharAt(i);
                          t.deleteCharAt(i);
                          break;
                     }
                     else if( (t1+32) == t2){
                          f = true;
                          t.deleteCharAt(i);
                          t.deleteCharAt(i);
                          break;
                     }
                }
                s = t.toString();
                if(!f) c = false;
           }
           return s;
    }
}