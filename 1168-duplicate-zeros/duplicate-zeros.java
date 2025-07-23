class Solution {
    public void duplicateZeros(int[] arr) {
           int[] res = new int[arr.length];
           for(int i=0;i<arr.length;i++) res[i] = arr[i]; 
           int i = 0;
           int j = 0;
           while(i<res.length){
                if(j == res.length) break;
                if(res[i] == 0){
                    arr[j] = 0;
                    j = j+1;
                    if(j == res.length) break;
                    arr[j] = 0;
                    j=j+1;
                }
                else{
                    arr[j] = res[i];
                    j++;
                }
                i++;
           }
    }
}