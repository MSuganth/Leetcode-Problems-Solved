class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
           int i = 1;
           int count = 0;
           while(i <= n*n){
               if( (i*w) <= maxWeight) count++;
               i++;
           }
           return count;
    }
}