package BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		Tree<Integer> myTree = new BST<>();
		
		myTree.insert(1);
		myTree.insert(2);
		myTree.insert(3);
		myTree.insert(4);
		myTree.insert(5);
		myTree.insert(50);
		myTree.insert(500);
		myTree.insert(52);
		
		System.out.println(myTree.getMaxVal());
		System.out.println(myTree.getMinVal());

	}

}
