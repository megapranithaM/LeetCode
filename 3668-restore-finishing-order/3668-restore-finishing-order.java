class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int a:friends){
            set.add(a);
        }
        int k=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                friends[k] = order[i];
                k++;
            }
        }
        return friends;
    }
}