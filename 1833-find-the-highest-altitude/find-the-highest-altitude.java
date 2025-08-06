class Solution {
    public int largestAltitude(int[] gain) {
          int[] arr = new int[gain.length+1];
          arr[0] = 0;
          arr[1] = gain[0];
          for(int i = 1;i<gain.length;i++){
              arr[i+1] = arr[i]+gain[i];
          }
          int max = 0;
          for(int i:arr) if(i>max) max = i;
          return max;
    }
}