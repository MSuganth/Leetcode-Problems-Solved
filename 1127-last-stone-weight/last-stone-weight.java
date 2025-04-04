class Solution {
    public int lastStoneWeight(int[] s) {
           ArrayList<Integer> arr = new ArrayList<>();
           for(int i = 0;i<s.length;i++){
               arr.add(s[i]);
           }
           Collections.sort(arr);
           while(arr.size() > 1){
                int sum = arr.get(arr.size()-1) - arr.get(arr.size()-2);
                if(sum == 0){
                   arr.remove(arr.get(arr.size()-1));
                   arr.remove(arr.get(arr.size()-1));
                }
                else{
                    arr.remove(arr.get(arr.size()-1));
                    arr.remove(arr.get(arr.size()-1));
                    arr.add(sum);
                    Collections.sort(arr);
                }
           }
           if(arr.size() == 0) return 0;
           return arr.get(0);
           
    }
}