class Solution {
    public int findGCD(int[] num) {
           int min = num[0];
           int max = num[0];
           for(int i = 0;i<num.length;i++){
              if(num[i] < min) min = num[i];
              if(num[i] > max) max = num[i];
           }
           int n = max%min;
           while(n != 0){
                int t = min;
                min = n; 
                n = t%n;
           }
           return min;
    }
}