public class This01{
	public static void main(String[] agrs){
		Dog dog1 = new Dog("��",3);
		dog1.out();
		System.out.println("dog1��hashCode = " + dog1.hashCode());

	}
}

class Dog{
	int age;
	String name;

	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("this��hashCode = " + this.hashCode());
	}

	public void out(){
		System.out.print("name:  " + name + '\n' 
			+ "age:  " + age + '\n');
	}
}

