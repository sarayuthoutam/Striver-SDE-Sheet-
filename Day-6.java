import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n=arr.size();
		HashMap<Integer,Integer> map=new HashMap<>();
		int sum=0;
		int i=0;
		int len=0;
		while(i<n){
			sum=sum+arr.get(i);
			if(sum==0){
				len=i+1;
			}
			if(map.containsKey(sum)){
				if(i-map.get(sum)>len){
					len=i-map.get(sum);
				}
			}
			else{
				map.put(sum,i);
			}
			i++;
		}
		return len;
	}
}