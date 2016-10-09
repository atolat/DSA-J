package BinarySearchTree;

public class BST<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void traverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(T newData) {
		Node<T> newNode = new Node<T>(newData);
		// Empty, new node will be root
		if (this.root == null) {
			this.root = newNode;
		} else {
			insertNode(newData, this.root);
		}
	}

	private void insertNode(T newData, Node<T> recurseNode) {
		Node<T> newNode = new Node<T>(newData);
		// Check if new data is lesser than root
		if (newData.compareTo(recurseNode.getData()) < 0) {
			// Check if Left Child is null
			if (recurseNode.getLeftChild() != null) {
				// Not null, Recursive call to insert
				insertNode(newData, recurseNode.getLeftChild());
			} else {
				// Left Child is null, assign new node as left child
				recurseNode.setLeftChild(newNode);
			}
		} else {
			// New Data is greater than root, not considering equality...
			if (recurseNode.getRightChild() != null) {
				insertNode(newData, recurseNode.getRightChild());
			} else {
				recurseNode.setRightChild(newNode);
			}
		}
	}

	@Override
	public void delete(T data) {
		// TODO Auto-generated method stub

	}

	public T getMax(Node<T> recurseNode) {
		// Rightmost Node!
		if (recurseNode.getRightChild() != null) {
			return getMax(recurseNode.getRightChild());
		}
		return recurseNode.getData();
	}

	public T getMin(Node<T> recurseNode) {
		// Leftmost Node!
		if (recurseNode.getLeftChild() != null) {
			return getMax(recurseNode.getLeftChild());
		}
		return recurseNode.getData();
	}

	@Override
	public T getMaxVal() {
		if (this.root != null)
			return getMax(this.root);
		return null;
	}

	@Override
	public T getMinVal() {
		if (this.root != null)
			return getMin(this.root);
		return null;
	}

}
