import java.util.*;
public class LinkedNode<T extends Comparable<? super T>>{
	private int length=0;
	private Node<T> firstNode = new Node();
	private Node<T> current;
	public void add(T item){
		firstNode = new Node<T>(item,firstNode);
		length++;
		current=firstNode;
	}
	
	public int getLength(){
		return length;
	}

	public Node<T> next(){
		Node<T> t = current;
		current = current.getNextNode();
		return t;
	}
	
	public void insertionSort(){
		if(length>1){
			Node<T> unsortedPart = firstNode.getNextNode();
			firstNode.setNextNode(null);
			
			while(unsortedPart.getNextNode()!=null){
				Node<T> nodeToInsert = unsortedPart;
				unsortedPart = unsortedPart.getNextNode();
				insertInOrder(nodeToInsert);
			}
		}
	}
	
	private void insertInOrder(Node<T> nodeToInsert){
		T item = nodeToInsert.getDate();	
		Node<T> currentNode=firstNode;
		Node<T> previousNode = null;
		
		while((currentNode!=null) && (item.compareTo(currentNode.getDate())>0)){
			previousNode = currentNode;
			currentNode	= currentNode.getNextNode();
		}
		
		if(previousNode!=null){
			previousNode.setNextNode(nodeToInsert);
			nodeToInsert.setNextNode(currentNode);
		}else{	//Insert at beginning
			nodeToInsert.setNextNode(firstNode);
			firstNode=nodeToInsert;
			current=firstNode;
		}
		
	}
	
	
	public static void main(String[] args){
		Random rand = new Random(47);	
		LinkedNode<Integer> link = new LinkedNode<Integer>();
		for(int i=0;i<10;i++)
			link.add(rand.nextInt(10));
		for(int i=0;i<link.getLength();i++){
			System.out.print(link.next()+" ");
		}
		
		link.insertionSort();
		System.out.println();
		for(int i=0;i<link.getLength();i++){
			System.out.print(link.next()+" ");
		}
		
		
	}
	
}

/*
Note: 7 Note: 2 Note: 0 Note: 8 Note: 9 Note: 1 Note: 1 Note: 3 Note: 5 Note: 8 
Note: 0 Note: 1 Note: 1 Note: 2 Note: 3 Note: 5 Note: 7 Note: 8 Note: 8 Note: 9 
*/