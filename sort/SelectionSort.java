public class SelectionSort{

	//selection sort
	public static <T extends Comparable<? super T>> void selectionSort(T[] a,int n){
		for(int index=0;index<n-1;index++){
			int indexOfNextSmallest = getIndexOfSmallest(a,index,n-1);
			swap(a,index,indexOfNextSmallest);
		
		}
	}

	private static <T extends Comparable< ? super T>> int getIndexOfSmallest(T[] a,int first,int last){
		T min = a[first];
		int indexOfMin=first;
		for(int i=first+1;i<=last;i++)
		{
			if(a[i].compareTo(min)<0)
			{
				min=a[i];
				indexOfMin=i;
			}
		}
	
		return indexOfMin;
	}
	
	private static void swap(Object[] a,int i,int j){
		Object temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
}
