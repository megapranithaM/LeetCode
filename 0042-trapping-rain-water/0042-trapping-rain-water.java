class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
        while(left<right){

        
        if(leftmax<rightmax){
            left++;
            leftmax=Math.max(height[left],leftmax);
            water+=leftmax-height[left];
        }else{
            right--;
            rightmax=Math.max(height[right],rightmax);
            water+=rightmax-height[right];
        }}
        return water;
    }
}