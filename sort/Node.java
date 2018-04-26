public class Node<T>{
	private T item;
	private Node<T> next;
	public Node(){
		item=null;
		next=null;
	}
	public Node(T item,Node<T> next){
		this.item = item;
		this.next = next;
	}
	public Node<T> getNextNode(){
		return next;
	}
	public void setNextNode(Node<T> nextNode){
		this.next = nextNode;
	}
	public T getDate(){
		return item;
	}
	public String toString(){
		return "Note: "+item;
	}
}