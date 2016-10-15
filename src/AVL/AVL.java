package AVL;

public class AVL implements Tree {

	private Node root;

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverse() {
		if (this.root == null)
			return;
		inOrderTrsverse(this.root);
	}

	private int height(Node node) {
		if (node == null)
			return -1;
		return node.getHeight();
	}

	private int getBalanceFactor(Node node) {
		if (node == null)
			return 0;
		return height(node.getLeftNode()) - height(node.getRightNode());

	}

	private void inOrderTrsverse(Node recurseNode) {
		if (recurseNode.getLeftNode() != null)
			inOrderTrsverse(recurseNode.getLeftNode());

		System.out.println(recurseNode);

		if (recurseNode.getRightNode() != null)
			inOrderTrsverse(recurseNode.getRightNode());
	}

	// Right Rotate
	private Node rotateRight(Node node) {

		System.out.println("Rotating Right");

		// Setting up temp nodes
		Node tempLeftNode = node.getLeftNode();
		Node t = tempLeftNode.getRightNode();

		// Node assignment
		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);

		// Update Heights
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()), height(tempLeftNode.getRightNode())) + 1);

		// Return the new Root
		return tempLeftNode;

	}
	
	// Left Rotate
	private Node rotateLeft(Node node) {

		System.out.println("Rotating Left");

		// Setting up temp nodes
		Node tempRightNode = node.getRightNode();
		Node t = tempRightNode.getLeftNode();

		// Node assignment
		tempRightNode.setLeftNode(node);
		node.setRightNode(t);

		// Update Heights
		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode())) + 1);
		tempRightNode.setHeight(Math.max(height(tempRightNode.getLeftNode()), height(tempRightNode.getRightNode())) + 1);

		// Return the new Root
		return tempRightNode;

	}

}
