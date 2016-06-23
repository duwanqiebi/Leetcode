

public class Solution {
	
	public String convertToTitle(int n) {
		String result = "";
		int s = n;
		while( s > 0){
			n = s % 26;	
			s = (s - 1) / 26;
			n = (n == 0 ? 26 : n);
			result =  (char) (n - 1 + 'A') + result;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(new Solution().convertToTitle(1048));
	}
}
