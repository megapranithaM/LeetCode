class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n=grid.length;
      int max=n*n;
      int rep=0;
      int mis=0;
      for(int num=1;num<=max;num++){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==num){
                    count++;
                }
            }
        }
        if(count==2){
            rep=num;
        }
        if(count==0){
            mis=num;
        }
      }
      return new int[]{rep,mis};
        
    }
}