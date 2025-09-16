class Solution {
    public int minStartValue(int[] nums) {
           int k = 1;
           boolean f = true;
           while(f){
                int sum = k;
                boolean c = false;
                for(int i:nums){
                    sum = sum + i;
                    if(sum < 1){
                       c = true;
                       break;
                    }
                }
                if(!c) f = false;
                k++; 
           }
           return k-1;
    }
}