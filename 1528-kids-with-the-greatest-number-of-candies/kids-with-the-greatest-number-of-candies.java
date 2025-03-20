class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
           int max = 0;
           ArrayList<Boolean> f = new ArrayList<>();
           for(int i = 0;i<c.length;i++){
               if(c[i]>max) max = c[i];
           }
           for(int i = 0;i<c.length;i++){
               if(c[i]+ec >= max) f.add(true);
               else f.add(false);
           }
           return f;
    }
}