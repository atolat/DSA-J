package AVL;

public class AVL implements Tree{

	private Node root;
	
	@Override
	public void insert(int data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverse() {
		if(this.root == null)
			return;
		inOrderTrsverse(this.root);
	}
	
	private int height(Node node) {
		if(node == null)
			return -1;
		return node.getHeight();
	}
	
	private int getBalanceFactor(Node node) {
		if(node == null)
			return 0;
		return height(node.getLeftNode()) - height(node.getRightNode());

	}

	private void inOrderTrsverse(Node recurseNode) {
		if(recurseNode.getLeftNode()!=null)
			inOrderTrsverse(recurseNode.getLeftNode());
		
		System.out.println(recurseNode);
		
		if(recurseNode.getRightNode()!=null)
			inOrderTrsverse(recurseNode.getRightNode());
	}

}
