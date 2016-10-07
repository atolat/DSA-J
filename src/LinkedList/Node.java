package LinkedList;

public class Node<T extends Comparable<T>> {

	//Define  data and next node pointer
	private T data;
	private Node<T> nextNode;


	//Constructor
	public  Node(T data){
		this.data = data;
	}

	//Getters & Setters
	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public Node<T> getNextNode() {
		return nextNode;
	}


	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	//Override toString() method to return node data
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data.toString();
	}


}
