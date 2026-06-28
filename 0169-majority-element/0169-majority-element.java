class Solution {
    public int majorityElement(int[] nums) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        int n=nums.length;
        int target=n/2;
        int freq=0;
        for(int num:map.keySet()){
            freq=map.get(num);
            if(freq>target){
                result=num;
                break;
            }
        }
        return result;
    }
}