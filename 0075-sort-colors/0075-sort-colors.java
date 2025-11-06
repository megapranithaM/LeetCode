class Solution{
    public void sortColors(int[] nums){
        int Zero=0;
        int One=0;
        int Two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                Zero++;
            }else if(nums[i]==1){
                One++;
            }else{
                Two++;
            }
        }
        int ind=0;
        for (int i=0;i<Zero;i++){
            nums[ind]=0;
            ind++;
        }
        for (int i=0;i<One;i++){
            nums[ind]=1;
            ind++;
        }
        for (int i= 0;i<Two;i++){
            nums[ind]=2;
            ind++;
        }
       }
}
