int climbStairs(int n) {
    int prev=1,curr=1,next;
    if(n==1) return n;
    for(int i=2;i<=n;i++){
        next=prev+curr;
        prev=curr;
        curr=next;
    }
    return next;
}
