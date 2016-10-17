package RedBlackTree;

public class RBTree implements Tree {

	private Node root;

	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverse() {
		if (root != null)
			inOrdertraverse(root);
	}

	private void inOrdertraverse(Node recurseNode) {
		if (recurseNode.getLeftChild() != null) {
			inOrdertraverse(recurseNode.getLeftChild());
		}

		System.out.println(recurseNode + "--");

		if (recurseNode.getRightChild() != null) {
			inOrdertraverse(recurseNode.getRightChild());
		}
	}

}
