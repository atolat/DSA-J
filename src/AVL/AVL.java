package AVL;

public class AVL implements Tree {

	private Node root;

	@Override
	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node recurseNode, int data) {
		// Check if root is null, tree is empty
		if (recurseNode == null)
			return new Node(data);
		// Right
		if (data > recurseNode.getData()) {
			recurseNode.setRightNode(insert(recurseNode.getRightNode(), data));
		}
		// Left
		else {
			recurseNode.setLeftNode(insert(recurseNode.getLeftNode(), data));
		}
		recurseNode.setHeight(Math.max(height(recurseNode.getLeftNode()), height(recurseNode.getRightNode())) + 1);

		recurseNode = checkForViolations(data, recurseNode);
		return recurseNode;
	}

	private Node checkForViolations(int data, Node recurseNode) {
		int balance = getBalanceFactor(recurseNode);

		// For Case I, Double left heavy -- One Right Rotation
		if (balance > 1 && data < recurseNode.getLeftNode().getData()) {
			return rotateRight(recurseNode);
		}

		// For Case II, Double right heavy -- One Left Rotation
		if (balance < -1 && data > recurseNode.getRightNode().getData()) {
			return rotateLeft(recurseNode);
		}

		// Case III, Left Right Heavy -- Two Rotations
		if (balance > 1 && data > recurseNode.getLeftNode().getData()) {
			recurseNode.setLeftNode(rotateLeft(recurseNode.getLeftNode()));
			return rotateRight(recurseNode);
		}

		// Case IV, Right Left Heavy -- Two Rotations
		if (balance < -1 && data < recurseNode.getRightNode().getData()) {
			recurseNode.setRightNode(rotateRight(recurseNode.getRightNode()));
			return rotateLeft(recurseNode);
		}
		return recurseNode;
	}

	@Override
	public void traverse() {
		if (this.root == null)
			return;
		inOrderTrasverse(this.root);
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

	private void inOrderTrasverse(Node recurseNode) {
		if (recurseNode.getLeftNode() != null)
			inOrderTrasverse(recurseNode.getLeftNode());

		System.out.println(recurseNode);

		if (recurseNode.getRightNode() != null)
			inOrderTrasverse(recurseNode.getRightNode());
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
		tempRightNode
				.setHeight(Math.max(height(tempRightNode.getLeftNode()), height(tempRightNode.getRightNode())) + 1);

		// Return the new Root
		return tempRightNode;

	}

}
