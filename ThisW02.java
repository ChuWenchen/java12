public class ThisW02{
	public static void main(String[] agrs){
		String x = null;
 		String[] arr = {"1","2","3","4"};
		A02 a = new A02();
		a.find(x,arr);
	}
}

// 类名 A02
// 方法名 find
// 返回 int
// 形参  (String , String[])  目标元素，索引的数组
class A02{
	public int find(String x , String[] arr){
		int i = 0;
		if(arr != null && arr.length > 0 && x != null){
			for(i = 0; i<arr.length; i++){
				if(x.equals(arr[i])){
					System.out.println("找到目标元素，下标为" + i);
					return i;
				}
			}
		}else{
			System.out.println("非法输入");
		}
		return -1;
	}
}