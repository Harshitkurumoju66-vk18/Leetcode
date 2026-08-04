class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int max=0,min=nums[0];
        for(int num:nums){
            if(max<num){
                max=num;
            }
             if(min>num){
                min=num;
            }
            s.add(num);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!s.contains(Integer.valueOf(i))){
                l.add(i);
            }
        }
        return l;
    }
}