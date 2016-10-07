package Stacks;

public class Stack<T extends Comparable<T>> {

	private Node<T> top;
	private int size = 0;

	public void push(T data) {
		size++;
		Node<T> newNode = new Node<>(data);
		//Check if stack is empty
		if(this.top == null){
			//New node with data is top
			this.top = newNode;
			newNode.setNextNode(null);
		} else {
			//reference newly added node to point to current top node
			Node<T> tempNode = this.top;
			this.top = newNode;
			newNode.setNextNode(tempNode);
		}
	}

	public T pop() {
		//check if list is empty
		if(size == 0){
			System.out.println("Empty Stack");
			return null;
		} else {
			size--;
			//Assign temp node to top
			T dataPopped = this.top.getData();
			this.top = this.top.getNextNode();
			return dataPopped;
			
		}
	}
	
	public void printStack() {
		if(size == 0){
			System.out.println("Empty Stack");
			
		} else {
			//Node<T> currentNode = this.top;
			while(this.top != null){
				System.out.print(this.top+"-->");
				this.top = this.top.getNextNode();
			}
			
		}

	}

}
