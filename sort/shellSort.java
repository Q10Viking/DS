public class ShellSort{
	
	public static <T extends Comparable<? super T>> void shellSort(T[] a,int n){
		int space = n/2;
		int first=0;
		int last=n;
		while(space>0){
			for(int begin=first;begin<first+space;begin++){
				incrementalInsertionSort(a,begin,last,space);
			}
			space=space/2;
			if(space != 0)
				space = (space%2==0)? space+1:space;
			
		}
	}
	
	private static <T extends Comparable<? super T>> void incrementalInsertionSort(T[] a,int begin,int last,int space){
		for(int unsorted=begin+space;unsorted<last;unsorted += space){
			T nextToInsert = a[unsorted];
			int index = unsorted-space;
			while((index>=begin) && (nextToInsert.compareTo(a[index]))<0){
				a[index+space]=a[index];
				index -= space;
			}
			a[index+space]=nextToInsert;
		}
	}
	
}