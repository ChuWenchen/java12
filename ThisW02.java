public class ThisW02{
	public static void main(String[] agrs){
		String x = null;
 		String[] arr = {"1","2","3","4"};
		A02 a = new A02();
		a.find(x,arr);
	}
}

// ���� A02
// ������ find
// ���� int
// �β�  (String , String[])  Ŀ��Ԫ�أ�����������
class A02{
	public int find(String x , String[] arr){
		int i = 0;
		if(arr != null && arr.length > 0 && x != null){
			for(i = 0; i<arr.length; i++){
				if(x.equals(arr[i])){
					System.out.println("�ҵ�Ŀ��Ԫ�أ��±�Ϊ" + i);
					return i;
				}
			}
		}else{
			System.out.println("�Ƿ�����");
		}
		return -1;
	}
}