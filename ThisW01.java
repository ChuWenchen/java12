public class ThisW01{
	public static void main(String[] agrs){
		double[] arr = {};
		A01 t = new A01();
		Double max = t.max(arr);
		if(max != null){
			System.out.println(t.max(arr));
		}else{
			System.out.println("非法输入");
		}
	}
}

class A01{
  // 这里用到一个返回  Double 的包装类
  // 因为如果数组满足条件，才会进入if语句并返回最大值
  // 而当数组不满足条件，没有元素或为空时，没办法返回，
  // 编译会发生没有返回值的错误
	public Double max(double[] arr){
		//先做一个判断，因为如果传进来的数组如果是空或者没有元素，
		//那么访问它第一个元素的时候就会发生越界。
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

