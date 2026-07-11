class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        
        for(int[] num:accounts){
            int sum=0;
            for(int element:num){
                sum+=element;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}