class Solution {
    public int reverse(int x) {
        int temp =0;
        int rem=0;
        while(x!=0){
            if(temp>Integer.MAX_VALUE/10 && rem>7 ||temp<Integer.MIN_VALUE/10 && rem <-8){
                return 0;
            }
            rem=x%10;
            temp=temp*10+rem;
            x/=10;
        }
        return temp;
    }
}