import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        n=mat.size();
        m=mat.get(0).size();
        int l=0,t=0,d=n-1,r=m-1;
        while(l<r && t<d){
            int prev=mat.get(t+1).get(l);
            for(int i=l;i<=r;i++){
                int curr=mat.get(t).get(i);
                mat.get(t).set(i,prev);
                prev=curr;
            }
            t++;
            for(int i=t;i<=d;i++){
                int curr= mat.get(i).get(r);
                mat.get(i).set(r,prev);
                prev=curr;
            }
            r--;
            for(int i=r;i>=l;i--){
                int curr=mat.get(d).get(i);
                mat.get(d).set(i,prev);
                prev=curr;
            }
            d--;
            for(int i=d;i>=t;i--){
                int curr=mat.get(i).get(l);
                mat.get(i).set(l,prev);
                prev=curr;
            }
            l++;
        }
    }
}
