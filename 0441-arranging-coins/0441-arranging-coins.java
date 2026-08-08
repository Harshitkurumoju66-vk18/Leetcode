class Solution {
    public int arrangeCoins(int n) {
        int temp=n;
        for(int i=1;i<=n;i++){
             if(temp<i){
                return i-1;
            }
            temp-=i;
            if(temp==0){
                return i;
            }
           
        }
        return 0;
    }
}