int maxSubArray(int* nums, int numsSize) {
    int m=nums[0];
    int n=0;
    for(int i=0;i<numsSize;i++)
    {
        n=n+nums[i];
        if(m<n)
        {
            m=n;
        }
        if(n<0)
        {
            n=0;
        }
        
    }
    return m;
}