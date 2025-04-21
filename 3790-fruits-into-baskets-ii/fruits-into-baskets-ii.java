class Solution {
    public int numOfUnplacedFruits(int[] fr, int[] bask) {
            List<Integer> b = new ArrayList<>();
            for(int i:bask) b.add(i);
            int c = 0;
            for(int i = 0;i<fr.length;i++){
                int l = b.size();
                for(int j:b){
                    if(fr[i] <= j){
                        b.remove(Integer.valueOf(j));
                        break;
                    }
                }
                if(l == b.size()) c++;
            }
            return c;
    }
}