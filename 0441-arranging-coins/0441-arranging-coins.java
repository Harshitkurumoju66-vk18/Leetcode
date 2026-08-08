class Solution {
    public int arrangeCoins(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            right-=left;
            left++;
        }
        return left-1;
    }
}