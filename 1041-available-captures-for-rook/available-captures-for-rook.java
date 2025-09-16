class Solution {
    public int numRookCaptures(char[][] b) {
          int res = 0;
          int r = 0;
          int c = 0;
          for(int i = 0;i<8;i++){
              boolean f = false;
              for(int j = 0;j<8;j++){
                  if(b[i][j] == 'R'){
                     r = i;
                     c = j;
                     f = true;
                     break;
                  }
              }
              if(f) break;
          }
          boolean f = false;
          for(int i = c+1;i<8;i++){
              if(b[r][i] == 'B') f = true;
              if(b[r][i] == 'p'){
                 if(!f) res++;
                 break;
              }
          }
          f = false;
          for(int i = c-1;i>=0;i--){
              if(b[r][i] == 'B') f = true;
              if(b[r][i] == 'p'){
                 if(!f) res++;
                 break;
              }
          }
          f = false;
          for(int i = r-1;i>=0;i--){
              if(b[i][c] == 'B') f = true;
              if(b[i][c] == 'p'){
                 if(!f) res++;
                 break;
              }
          }
          f = false;
          for(int i = r+1;i<8;i++){
              if(b[i][c] == 'B') f = true;
              if(b[i][c] == 'p'){
                 if(!f) res++;
                 break;
              }
          }
          return res;
    }
}