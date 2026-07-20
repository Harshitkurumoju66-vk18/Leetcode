class Solution {
    public int hammingWeight(int n) {
        String str="";
        while(n>0){
            str=str+n%2;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count++;
    }
}