public class ThisW03{
	public static void main(String[] agrs){
		Book b = new Book("�����˲�",230);
		b.out();
		b.updatePrice();
		b.out();
	}
}

// ���� Book
// ������ updatePrice
// ����ֵ int
// �β� ��int��
class Book{
	String name;
	int price;
	// ������
	public Book(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			price = 150;
		}else if(this.price > 100){
			price = 100;
		}
	}
	public void out(){
		System.out.println("����: " + this.name + "  "
			+ "�۸�: " + this.price);
	}
}