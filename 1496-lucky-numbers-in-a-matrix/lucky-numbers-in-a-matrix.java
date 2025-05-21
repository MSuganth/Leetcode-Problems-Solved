class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
           List<Integer> res = new ArrayList<>();
           for(int i = 0;i<m.length;i++){
              int min = Integer.MAX_VALUE;
              int max = Integer.MIN_VALUE;
              int in = 0;
              for(int j = 0;j<m[i].length;j++){
                  if(m[i][j] < min){
                    min = m[i][j];
                    in = j;
                  }
              }
              for(int k = 0;k<m.length;k++){
                   if(m[k][in] > max) max = m[k][in];
              }
              if(min == max) res.add(min);
           }
           return res;
    }
}