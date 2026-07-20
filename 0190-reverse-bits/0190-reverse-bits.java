class Solution {
    public int reverseBits(int n) {
        String str="";
        while(n>0 || str.length()!=32){
            str=str+n%2;
            n/=2;
        }
        int num=0;
        int pos=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch=='1'){
                num=num+(int)Math.pow(2,pos++);
            }
            else{
                pos++;
            }
        }
        return num;
    }
}