public class ThisW03{
	public static void main(String[] agrs){
		Book b = new Book("天龙八部",230);
		b.out();
		b.updatePrice();
		b.out();
	}
}

// 类名 Book
// 方法名 updatePrice
// 返回值 int
// 形参 （int）
class Book{
	String name;
	int price;
	// 构造器
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
		System.out.println("书名: " + this.name + "  "
			+ "价格: " + this.price);
	}
}