
public class Solution {
	
	public int titleToNumber(String s) {
		int result = 0;
		int base = 1;
		for(int i = s.length() - 1 ; i >= 0; i --){
			char ch = s.charAt(i);
			result += ((int)(ch + 1 - 'A')) * base;
			base *= 26;
		}
		return result;
    }
	
	public static void main(String[] args){
		System.out.println(new Solution().titleToNumber("ANH"));
	}
}
