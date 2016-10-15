package BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		Tree<Integer> myTree = new BST<>();
		
		myTree.insert(40);
		myTree.insert(39);
		myTree.insert(57);
		myTree.insert(15);
		myTree.insert(44);
		myTree.insert(77);
		myTree.insert(27);
		myTree.insert(58);
		myTree.insert(99);
		
		
		System.out.println(myTree.getRoot());
		System.out.println(myTree.getMaxVal());
		System.out.println(myTree.getMinVal());
		myTree.traverse();

	}

}
