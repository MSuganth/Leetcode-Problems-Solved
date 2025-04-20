class Solution {
    public boolean validMountainArray(int[] arr) {
           if(arr.length<=2) return false;
           int in = 0;
           int max = 0;
           for(int i = 0;i<arr.length;i++){
               if(arr[i] > max){
                  max = arr[i];
                  in = i;
               }
           }
           if(in == arr.length-1 || in == 0) return false;
           for(int i = 0;i<in;i++){
               if(arr[i] >= max) return false;
               else if(arr[i] >= arr[i+1]) return false;
           }
           for(int i = arr.length-1;i>in;i--){
               if(arr[i] >= max) return false;
               else if(arr[i]>=arr[i-1]) return false;
           }
           return true;
    }
}