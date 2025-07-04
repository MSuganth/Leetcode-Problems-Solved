class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
           res.append(arr[i]+" ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}