
import java.util.Random;

public class Solution {
	public static String reverseString(String s) {
		char[] chars = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i = chars.length - 1; i >= 0; i --){
			sb.append(chars[i]);
		}
		return sb.toString();
	}
	/**双指针      速度快**/
	public static String reverseString1(String s) {
		char[] chars = s.toCharArray();
		int left = 0;
		int right = chars.length - 1;
		while(left < right){
			char tmp = chars[left];
			chars[left ++] = chars[right];
			chars[right --] = tmp;
		}
		return new String(chars);
	}
	
	public static void main(String[] args){
		int length = 10000;
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		int i = 0;
		while(i < length){
			sb.append(random.nextInt());
			i ++;
		}
		String s = sb.toString();
		long cur = System.currentTimeMillis();
		Solution.reverseString(s);
		System.out.println("STringBuffer :" +  (System.currentTimeMillis() - cur));
		
		cur = System.currentTimeMillis();
		Solution.reverseString1(s);
		System.out.println("双指针 :" +  (System.currentTimeMillis() - cur));
	}
}
