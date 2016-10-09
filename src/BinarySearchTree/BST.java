package BinarySearchTree;

public class BST<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;

	@Override
	public void traverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(T newData, Node<T> recurseNode) {
		Node<T> newNode = new Node<T>(newData);
		//Empty, new node will be root
		if(this.root == null){
			this.root = newNode;
		} else {
			//Check if new data is lesser than root
			if(newData.compareTo(root.getData())<0){
				//Check if Left Child is null
				if(root.getLeftChild()!=null){
					//Not null, Recursive call to insert
					insert(newData,root.getLeftChild());
				} else {
					//Left Child is null, assign new node as left child
					root.setLeftChild(newNode);
				}
			} else {
				//New Data is greater than root, not considering equality...
				if(root.getRightChild()!=null){
					insert(newData,root.getRightChild());
				} else {
					root.setRightChild(newNode);
				}
			}
		}
		
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

}
