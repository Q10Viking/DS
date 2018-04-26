public class InsertionSort{
	public static <T extends Comparable<? super T>> void insertionSort(T[] a,int n){
		int begin=0;
		for(int unsort=begin+1;unsort<n;unsort++){
			T nextToInsert=a[unsort];
			insertInOrder(nextToInsert,a,begin,unsort-1);
		}
	}
	
	private static <T extends Comparable< ? super T>> void insertInOrder(T anEntry,T[] a,int begin,int end){
		int index=end;
		while((index>=begin) && (anEntry.compareTo(a[index]))<0){
			a[index+1]=a[index];
			index--;
		}
		a[index+1]=anEntry;
	}
	
}