class Solution {
    public static boolean binary(int[] arr,int k){
          int mid = arr.length/2;
          int l = 0;
          int r = arr.length-1;
          if(k == arr[mid]) return true;
          else if(k < arr[mid]){
               r = mid;
               while(l<=r){
                    if(arr[l] == k || arr[r] == k) return true;
                    l++;
                    r--;
               }
          }
          else{
            l = mid;
            while(l<=r && l<arr.length){
                    if(arr[l] == k || arr[r] == k) return true;
                    l++;
                    r--;
               }
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