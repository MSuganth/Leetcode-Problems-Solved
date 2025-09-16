class Solution {
    public static boolean check1(int[] arr){
           for(int i = 1;i<arr.length;i++){
               if(arr[i] < arr[i-1]) return false;
           }
           return true;
    }
    public static boolean check2(int[] arr){
           for(int i = 1;i<arr.length;i++){
               if(arr[i] > arr[i-1]) return false;
           }
           return true;
    }
    public boolean isMonotonic(int[] nums) {
           if(check1(nums)) return true;
           if(check2(nums)) return true;
           return false;
    }
}