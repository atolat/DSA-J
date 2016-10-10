package BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		Tree<Integer> myTree = new BST<>();
		
		myTree.insert(32);
		myTree.insert(10);
		myTree.insert(55);
		myTree.insert(1);
		myTree.insert(19);
		myTree.insert(16);
		myTree.insert(23);
		myTree.insert(79);
		
		System.out.println(myTree.getMaxVal());
		System.out.println(myTree.getMinVal());
		myTree.traverse();

	}

}
