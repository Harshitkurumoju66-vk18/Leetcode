class Solution {
    public int minimumPushes(String word) {
        int len=word.length();
        if(len<9){
            return len;
        }
        int mul=1;
        int num=0;
        for(int i=1;i<=len;i++){
            num+=1*mul;
            if(i%8==0){
                mul++;
            }
        }
        return num;
    }
}