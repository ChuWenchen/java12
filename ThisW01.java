public class ThisW01{
	public static void main(String[] agrs){
		double[] arr = {};
		A01 t = new A01();
		Double max = t.max(arr);
		if(max != null){
			System.out.println(t.max(arr));
		}else{
			System.out.println("�Ƿ�����");
		}
	}
}

class A01{
  // �����õ�һ������  Double �İ�װ��
  // ��Ϊ������������������Ż����if��䲢�������ֵ
  // �������鲻����������û��Ԫ�ػ�Ϊ��ʱ��û�취���أ�
  // ����ᷢ��û�з���ֵ�Ĵ���
	public Double max(double[] arr){
		//����һ���жϣ���Ϊ�������������������ǿջ���û��Ԫ�أ�
		//��ô��������һ��Ԫ�ص�ʱ��ͻᷢ��Խ�硣
		if(arr != null && arr.length > 0){
			double max = arr[0];
			for(int i = 0; i<arr.length;i++){
				if(max < arr[i]){
					max = arr[i];
				}
			}
			return max;
		}else{
			return null;
		}

	}
}

