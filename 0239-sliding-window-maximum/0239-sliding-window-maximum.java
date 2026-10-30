class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] result=new int[n-k+1];
        int resultindex=0;
        Deque<Integer> deque=new LinkedList<>();
        for(int right=0;right<n;right++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[right]){
                deque.pollLast();
            }
            while(!deque.isEmpty() && deque.peekFirst()<=right-k){
                deque.pollFirst();
            }
            deque.addLast(right);
            if(right>=k-1){
                result[resultindex]=nums[deque.peekFirst()];
                resultindex++;
            }
        }
        return result;
    }
}


























