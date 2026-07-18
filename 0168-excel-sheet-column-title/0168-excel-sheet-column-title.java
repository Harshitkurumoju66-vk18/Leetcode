class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        if(columnNumber<27){
            str=str+(char)(columnNumber+64);
            return str;
        }
        while(columnNumber>0){
            columnNumber--;
            str=str+(char)((columnNumber)%26+65);
            columnNumber/=26;
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        return rev;
    }
}