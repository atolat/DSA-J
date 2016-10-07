package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	//Define head node & size
	private Node<T> head;
	private int sizeOfList;
	
	@Override
	public void addData(T data) {
		//Increment size of List
		sizeOfList++;
		//Check if List is empty --> check if head is null
		if(head == null){
			//Head is the new node, and the only node in the List
			this.head = new Node<>(data);
		} else {
			//Create a new node with data
			Node<T> newNode = new Node<>(data);
			//New Node must point to Head
			newNode.setNextNode(head);
			//Set New Node to Head
			this.head = newNode;
		}
		
		
	}

	@Override
	public void removeData(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverseList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
