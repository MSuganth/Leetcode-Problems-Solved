class Solution {
    public static boolean binary(int[] arr,int k){
          int n = arr.length;
          int l = 0;
          int r = n-1;
          while(l<=r){
              int mid = (l+r)/2;
              if(arr[mid] == k) return true;
              else if(k > arr[mid]) l = mid+1;
              else r = mid-1; 
          }
          return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
         int m = mat.length;
         int n = mat[0].length;
         for(int i =0;i<m;i++){
            if(binary(mat[i],target)) return true;
         }
         return false;
    }
}