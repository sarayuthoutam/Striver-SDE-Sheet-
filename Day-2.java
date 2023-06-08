import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] ar, int n) {
		long sum=0;
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=ar[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
		if(max<0) return 0;
        return max;
	}

}