

public class Solution {
	
	public int numTrees(int n) {
		int[] result = new int[n + 1];  
		
		if(n >= 0){
			result[0] = 1;
		}
		if(n >= 1){
			result[1] = 1;
			int index = 2;
			while(index <= n ){
				for(int i = 0; i < index; i ++){
					result[index] += result[i] * result[index - 1 - i];
				}
				index ++;
			}
		}
		return result[n];
	}
	
	public static void main(String[] args){
		System.out.println(new Solution().numTrees(4));;
	}
}
