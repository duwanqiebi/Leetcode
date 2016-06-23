

import java.util.Arrays;

public class Solution {
	
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()){
			return false;
		}
		
		char[] charS = s.toCharArray();
		char[] charT = t.toCharArray();
		
		Arrays.sort(charS);
		Arrays.sort(charT);
		
		for(int i = 0 ;i < charS.length; i ++){
			if(charS[i] != charT[i]){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		new Solution().isAnagram("a", "b");
	}
}
