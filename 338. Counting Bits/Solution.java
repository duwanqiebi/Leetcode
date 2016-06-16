

public class Solution {
	/**奇偶*/
	public  int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for(int i = 1; i <= num; i ++){
        	if((i & 1) == 1 ){
        		//如果i最后一位为1 ，则可直接加1
        		result[i] = result[i - 1] + 1;
        	}else{
        		//如果i最后一位为0，则当前结果与上一个数结果相关
        		int pre = i - 1;		//上一个数
        		int sum = result[pre];  //上一个数中1的个数
        		while((pre & 1) == 1){
        			sum --;
        			pre = pre >> 1;		//右移一位
        		}
        		//进位补1
        		sum ++ ;
        		result[i] = sum;
        	}
        }
        
        return result;
    }
	
	/**分段*/
	public  int[] countBits1(int num) {
		int[] result = new int[num + 1];
        result[0] = 0;
        int i = 1;
        int sum = 1;		//之前段的数量总和
        while( i < num + 1){
        	int right = i + sum;
        	for(; i < right; i ++){
        		if(i == num + 1){
        			break;
        		}
        		result[i] = result[i - sum] + 1;
        	}
        	sum *= 2;
        }
        
        
        return result;
	}
	
	public static void main(String[] args){
		Solution so = new Solution();
		int[] s = so.countBits1(5);
		for(int cur : s){
			System.out.print(cur + " ");
		}
	}
}
