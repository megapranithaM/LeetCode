class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,max_count=0,zero_count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zero_count++;
            }
            while(zero_count>k){
                if(nums[left]==0){
                    zero_count--;
                }
                left++;
            }
            max_count=Math.max(max_count,right-left+1);
        }
        return max_count;
    }
}