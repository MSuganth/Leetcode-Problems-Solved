class Solution {
    public boolean isPrefixString(String st, String[] w) {
           StringBuilder res = new StringBuilder();
           for(String s:w){
               res.append(s);
               if(res.toString().equals(st)) return true;
           }
           return false;
    }
}