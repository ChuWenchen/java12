public class ThisD{
	public static void main(String[] agrs){
		T t = new T();
		t.f1();
		System.out.println("-------------");
		t.f2();
	}
}

class T{
	String name = "张三";
	int age = 20;

	// 用this调用构造器，只能在一个构造器中调用另一个构造器
	// 切必须放在第一条语句
	public T() {
		this("张三");
		System.out.println("T()构造器");

	}

	public T(String name){
		System.out.println("T(String name)构造器");
	}

	// this 可以用来访问本类的属性
	public void f1(){
		System.out.println(name + "  " + age);
		System.out.println(this.name + "  " + this.age);
	}
	public void f2(){
		String name = "李四";
		System.out.println(name + "  " + age);
		System.out.println(this.name + "  " + this.age);
	}
}