class Solution {
    public String replaceDigits(String s) {
        String output = "";
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int t = (int) s.charAt(i-1)+ Character.getNumericValue(s.charAt(i));
                output += (char) t;
            }
            else output += s.charAt(i);
        }
        return output;
    }
}