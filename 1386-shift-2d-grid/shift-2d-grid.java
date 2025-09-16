class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
           int m = grid.length;
           int n = grid[0].length;
           int r = 1;
           while(r<=k){
                 int[][] t = new int[m][n];
                 for(int i= 0;i<m;i++){
                     for(int j = 0;j<n;j++){
                         if( i == m-1 && j == n-1){
                              t[0][0] = grid[i][j];
                         }
                         else if(j == n-1){
                              t[i+1][0] = grid[i][j];
                         }
                         else{
                             t[i][j+1] = grid[i][j];
                         }
                     }
                 }
                 grid = t;
                 r++;
           }
           List<List<Integer>> res = new ArrayList<>();
           for(int i = 0;i<m;i++){
               List<Integer> t = new ArrayList<>();
               for(int j = 0;j<n;j++){
                   t.add(grid[i][j]);
               }
               res.add(t);
           }
           return res;
    }
}