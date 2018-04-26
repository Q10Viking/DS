public class SortArray{
	//selection sort
	public static <T extends Comparable<? super T>> void selectionSort(T[] a,int n){
			SelectionSort.selectionSort(a,n);
	}
	
	public static <T extends Comparable<? super T>> void insertionSort(T[] a,int n){
			InsertionSort.insertionSort(a,n);
	}
	
}
