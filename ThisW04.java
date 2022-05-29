public class ThisW04{
	public static void main(String[] agrs){
		int[] arr = {1,2,3,4};
		A03 a = new A03();
		// 调用方法，因为返回的是一个数组，所以用一个新数组接收
		int[] newArr = a.copyArr(arr);
		for(int i = 0; i<newArr.length; i++){
			System.out.print(newArr[i] + "  ");
		}
	}
}

// 类名 A03
// 方法 copyArr
// 返回一个新数组 int[] brr
// 返回值 int[]
// 形参(int[] arr)
 
class A03{
	public int[] copyArr(int[] oldArr){
		// 创建一个新数组，长度跟老数组的一样
		int[] newArr = new int[oldArr.length];
		for(int i  = 0; i<oldArr.length; i++){
			newArr[i] = oldArr[i];
		}
		return newArr;
	}


}