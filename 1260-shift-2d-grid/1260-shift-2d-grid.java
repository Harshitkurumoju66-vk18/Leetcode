import java.util.*;
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int index=0;
        int arr[]=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[index++]=grid[i][j];
            }
        }
        int len=arr.length;
        while(k>0){
            int temp=arr[len-1];
            for(int i=len-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            k--;
        }
        int in=0;
       List<List<Integer>> l1=new ArrayList<>();
       for(int i=0;i<m;i++){
        ArrayList<Integer> a1=new ArrayList<>();
        for(int j=0;j<n;j++){
            a1.add(arr[in++]);
        }
        l1.add(a1);

       }
               return l1;
    }
}