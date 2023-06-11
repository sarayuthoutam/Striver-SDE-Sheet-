import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(long x, long n, long m) {
        long c=n;
        long f=1;
        while(c>0){
            if(c%2==0){
                x=(x*x)%m;
                c/=2;
            }
            f=(f*x)%m;
            c--;
        }
        return (int)f;
    }
}