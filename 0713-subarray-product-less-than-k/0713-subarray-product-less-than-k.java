class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0,count=0,pro=1;
        for(int right=0;right<nums.length;right++){
            pro*=nums[right];
            while(pro>=k){
                pro/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}