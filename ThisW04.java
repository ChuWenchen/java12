public class ThisW04{
	public static void main(String[] agrs){
		int[] arr = {1,2,3,4};
		A03 a = new A03();
		// ���÷�������Ϊ���ص���һ�����飬������һ�����������
		int[] newArr = a.copyArr(arr);
		for(int i = 0; i<newArr.length; i++){
			System.out.print(newArr[i] + "  ");
		}
	}
}

// ���� A03
// ���� copyArr
// ����һ�������� int[] brr
// ����ֵ int[]
// �β�(int[] arr)
 
class A03{
	public int[] copyArr(int[] oldArr){
		// ����һ�������飬���ȸ��������һ��
		int[] newArr = new int[oldArr.length];
		for(int i  = 0; i<oldArr.length; i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}


}