import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		int l=0,r=0;
		HashSet<Character> set=new HashSet<>();
		int max=Integer.MIN_VALUE;
		while(r<s.length()){
			if(!set.contains(s.charAt(r))){
				set.add(s.charAt(r));
				max=Math.max(max,set.size());
				r++;
			}
			else{
				l++;
				r=l;
				set.clear();
			}
		}
		return max;
	}
}
