class Solution {
    public boolean isThree(int n) {
        int num=1;
        int count=0;
        while(num<=n){
            if(n%num==0)
             count++;
            num++;
            if(count>3){
                return false;
            }
        }
        return count==3;
    }
}