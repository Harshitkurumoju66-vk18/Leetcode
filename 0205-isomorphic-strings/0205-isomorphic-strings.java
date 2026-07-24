class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map=new HashMap<>();
       int len=s.length();
       for(int i=0;i<len;i++){
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        if(map.containsKey(ch1)){
            if(ch2!=map.get(ch1)){
                return false;
            }
        }
        if(map.containsValue(ch2)){
            if(!map.containsKey(ch1)){
                return false;
            }
        }
        map.put(ch1,ch2);
       }
       return true;
    }
}