class Solution {
    public static boolean binary(int[] arr,int k){
          int l = 0;
          int r = arr.length-1;
          while(l<=r){
             int mid = (l+r)/2;
             if(k == arr[mid]) return true;
             else if(k < arr[mid]) r = mid-1;
             else l = mid +1;
          }
          return false;
    }
    public boolean searchMatrix(int[][] mat, int t) {
          int m = mat.length;
          int n = mat[0].length;
          for(int i = 0;i<m;i++){
              if(binary(mat[i],t)) return true;
          }
          return false;
    }
}