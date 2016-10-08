package QueueLinkedList;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> head;
	private Node<T> tail;
	private int count = 0;
	
	public void enqueue(T data) {
		count++;
		Node<T> newNode = new Node<>(data);
		if(isEmpty()){
			this.head = newNode;
			this.tail = newNode;
			this.tail.setNextNode(null);
		} else {
			Node<T> oldTail = this.tail;
			this.tail = newNode;
			oldTail.setNextNode(newNode);
			newNode.setNextNode(null);
		}
		
	}
	
	
	public T dequeue(){
		if(isEmpty()){
		System.out.println("Queue is Empty!");
		return null;
		} else {
			count --;
			Node<T> nodeToRemove = this.head;
			this.head = this.head.getNextNode();
			return nodeToRemove.getData();
			
		}
	}

	public int getCount(){
		return this.count;
	}
	
	
	
	private boolean isEmpty() {
		return this.head == null;
	}
	

}
