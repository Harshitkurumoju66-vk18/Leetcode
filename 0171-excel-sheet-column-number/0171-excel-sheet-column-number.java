class Solution {
    public int titleToNumber(String columnTitle) {
        int num=0;
        int l=columnTitle.length();
        if(l==1){
            return ((int)columnTitle.charAt(0)-64);
        }
        for(int i=0;i<columnTitle.length();i++){
            int no=(int)columnTitle.charAt(i)-64;
            num=num+no*(int)Math.pow(26,l-1);
            l--;
        }
        return num;
    }
}