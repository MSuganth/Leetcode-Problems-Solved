class Solution {
    public int isPrefixOfWord(String s, String sw) {
           String[] arr = s.split(" ");
           int l = sw.length();
           for(int i = 0;i<arr.length;i++){
               if(arr[i].length() >= l) if(arr[i].substring(0,l).equals(sw)) return i+1;
           }
           return -1;
    }
}