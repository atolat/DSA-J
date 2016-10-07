package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	//Define head node & size
	private Node<T> head;
	private int sizeOfList = 0;
	

	@Override
	public void addData(T data) {
		//Increment size of List
		sizeOfList++;
		//Check if List is empty --> check if head is null
		if(this.head == null){
			System.out.println("HEAD NODE ADDED");
			//Head is the new node, and the only node in the List
			this.head = new Node<>(data);
		} else {
			//Create a new node with data
			Node<T> newNode = new Node<>(data);
			//New Node must point to Head
			newNode.setNextNode(head);
			//Set New Node to Head
			this.head = newNode;
			System.out.println("NEW NODE ADDED");
		}

	}

	@Override
	public void removeData(T data) {
		//Check if list is empty
		if(this.head == null)
			return;
		//Check if head is the node to be deleted, Use compareTo() to check for equality of data
		if(this.head.getData().compareTo(data) == 0){
			sizeOfList--;
			//Delete Head node
			//Assign head to the next node(second) in the list
			this.head = this.head.getNextNode();
		} else {
			//Look for the node to delete by matching data iteratively
			//set current node to head
			Node<T> previousNode = this.head;
			Node<T> currentNode = this.head.getNextNode();

			//Traverse List, check if next is null
			while(currentNode != null){
				//Check if data at each step matches data to delete
				if(currentNode.getData().compareTo(data) == 0){
					//Create a new temp Node to hold value of node to delete 
					//If data matches, assign temp node to currentNode
					Node<T> nodeToDelete = currentNode;
					//set next pointer of current to the next node of next node :P
					previousNode.setNextNode(nodeToDelete.getNextNode());
					//Set temp node to null
					nodeToDelete = null;
					sizeOfList--;
				}
				currentNode = currentNode.getNextNode();
				previousNode = previousNode.getNextNode();
			}

		}



	}

	@Override
	public void traverseList() {
		Node<T> currentNode = this.head;
		if(currentNode == null){
			System.out.println("List is Empty");
		} else {
			while(currentNode!=null){
				System.out.print(currentNode+" -->");
				currentNode = currentNode.getNextNode();
			}
		}
	}

	@Override
	public int getSize() {
		return sizeOfList;
	}

}
