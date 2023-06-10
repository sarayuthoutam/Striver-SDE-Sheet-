import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] c=new int[n+1];
        int[] res=new int[2];
       for(int i=1;i<n+1;i++){
           c[arr.get(i-1)]++;
       }
      
       for(int i=1;i<n+1;i++){
           if(c[i]==0){
               res[0]=i;
           }
           if(c[i]>1){
               res[1]=i;
           }
       }
       return res;
    }

}