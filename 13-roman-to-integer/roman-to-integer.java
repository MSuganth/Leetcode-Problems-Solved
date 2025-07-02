class Solution {
    public int romanToInt(String s) {
           Map<String,Integer> map = new HashMap<>();
           map.put("I",1);
           map.put("V",5);
           map.put("X",10);
           map.put("L",50);
           map.put("C",100);
           map.put("D",500);
           map.put("M",1000);
           int[] arr = new int[s.length()];
           for(int i=0;i<s.length();i++) arr[i] = map.get(s.charAt(i)+"");
           int sum = 0;
           for(int i=0;i<arr.length;i++){
              if(arr[i] != 0){
                 if(i == arr.length-1){
                    sum = sum + arr[i];
                    continue;
                 }
                 if(arr[i+1]>arr[i]){
                    sum = sum + (arr[i+1]-arr[i]);
                    arr[i+1] = 0;
                 }
                 else sum = sum + arr[i]; 
              }
           }
           return sum;
    }
}