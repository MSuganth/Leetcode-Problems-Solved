class Solution {
    public int numJewelsInStones(String j, String s) {
        int c = 0;
        for(int i = 0;i<s.length();i++){
            String t = String.valueOf(s.charAt(i));
            if(j.contains(t)) c++;
        }
        return c;
    }
}