public class ThisD{
	public static void main(String[] agrs){
		T t = new T();
		t.f1();
		System.out.println("-------------");
		t.f2();
	}
}

class T{
	String name = "����";
	int age = 20;

	// ��this���ù�������ֻ����һ���������е�����һ��������
	// �б�����ڵ�һ�����
	public T() {
		this("����");
		System.out.println("T()������");

	}

	public T(String name){
		System.out.println("T(String name)������");
	}

	// this �����������ʱ��������
	public void f1(){
		System.out.println(name + "  " + age);
		System.out.println(this.name + "  " + this.age);
	}
	public void f2(){
		String name = "����";
		System.out.println(name + "  " + age);
		System.out.println(this.name + "  " + this.age);
	}
}