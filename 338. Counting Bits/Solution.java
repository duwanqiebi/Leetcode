

public class Solution {
	/**��ż*/
	public  int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for(int i = 1; i <= num; i ++){
        	if((i & 1) == 1 ){
        		//���i���һλΪ1 �����ֱ�Ӽ�1
        		result[i] = result[i - 1] + 1;
        	}else{
        		//���i���һλΪ0����ǰ�������һ����������
        		int pre = i - 1;		//��һ����
        		int sum = result[pre];  //��һ������1�ĸ���
        		while((pre & 1) == 1){
        			sum --;
        			pre = pre >> 1;		//����һλ
        		}
        		//��λ��1
        		sum ++ ;
        		result[i] = sum;
        	}
        }
        
        return result;
    }
	
	/**�ֶ�*/
	public  int[] countBits1(int num) {
		int[] result = new int[num + 1];
        result[0] = 0;
        int i = 1;
        int sum = 1;		//֮ǰ�ε������ܺ�
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
