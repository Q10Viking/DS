class Apple implements Comparable<Apple>{
	private int weight;
	public Apple(int weight){
		this.weight=weight;
	}
	@Override
	public int compareTo(Apple other){
		if(this.weight<other.weight)
			return -1;
		if(this.weight==other.weight)
			return 0;
		return 1;
	}
	public String toString(){
		return "Apple weight: "+weight;
	}
}

public class IntegerTest{
	public static void main(String[] args){
		Integer[] nums={8,5,10,2};
		Apple[] apples={new Apple(32),new Apple(20),new Apple(25),new Apple(40)};
	//	SortArray.insertionSort(apples,apples.length);
		SortArray.shellSort(apples,apples.length);
		for(Apple apple: apples)
			System.out.println(apple);
	//	SortArray.selectionSort(nums,nums.length);
		SortArray.insertionSort(nums,nums.length);
		for(int s:nums)
			System.out.print(s+" ");
	}

}
