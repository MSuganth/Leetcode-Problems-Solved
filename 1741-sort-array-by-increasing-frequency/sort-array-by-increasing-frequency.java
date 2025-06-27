class Solution {
    public int[] frequencySort(int[] nums) {
           int fre[] = new int[201];
           for(int i:nums){
              fre[i+100]++;
           }
           int c = 0;
           while(c < nums.length){
                 int min = Integer.MAX_VALUE;
                 int in = -1;
                 for(int i = 0;i<201;i++){
                     if(fre[i] != 0){
                        if(fre[i] <= min){
                            min = fre[i];
                            in = i;
                        }
                     }
                 }
                 nums[c++] = in-100;
                 fre[in]--;
           }
           return nums;
    }
}