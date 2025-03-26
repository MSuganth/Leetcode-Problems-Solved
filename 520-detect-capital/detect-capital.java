class Solution {
    public boolean detectCapitalUse(String w) {
        int upcount = 0;
        int lowcount = 0;
        for(int i = 0;i<w.length();i++){
            int t = w.charAt(i);
            if( t >= 65 && t <= 90) upcount++;
            else lowcount++;
        }
        if(upcount == w.length()) return true;
        else if(lowcount == w.length()) return true;
        else if(upcount == 1){
             int temp = w.charAt(0);
             if( temp >= 65 && temp <= 90) return true;
             return false;
        }
        return false;
    }
}