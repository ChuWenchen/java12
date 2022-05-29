public class This01{
	public static void main(String[] agrs){
		Dog dog1 = new Dog("Íô",3);
		dog1.out();
		System.out.println("dog1µÄhashCode = " + dog1.hashCode());

	}
}

class Dog{
	int age;
	String name;

	public Dog(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("thisµÄhashCode = " + this.hashCode());
	}

	public void out(){
		System.out.print("name:  " + name + '\n' 
			+ "age:  " + age + '\n');
	}
}

