import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int n=matrix.length;
        int m=matrix[0].length;
       boolean[][] vis=new boolean[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(matrix[i][j]==0){
                   int k1=i;
                   int k2=j;
                   for(int j1=0;j1<m;j++){
                       matrix[k1][j1]=0;
                       vis[k1][j1]=true;
                   }
                       matrix[i1][k2]=0;
                       vis[i1][k2]=0;
                   }
               }
           }
       }
    }

}