public class ThisT01{
	public static void main(String[] agrs){
		Person p1 = new Person("����",20);
		Person p2 = new Person("����",20);
		System.out.println(p1.comperP(p2));
	}
}

class Person{
	String name;
	int age;

	public Person(String name,int age){
		this.name = name;
    	this.age = age;
	} 

	public boolean comperP(Person p){
/*		if(this.name.equals(p.name) && this age == p.age){
			return true;
		}else{
			return false;
		}
*/
		//�ɽ�����if����Ϊ
		return this.name.equals(p.name) && 
				this.age == p.age;
	}
}