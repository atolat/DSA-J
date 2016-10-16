package AVL;

public class Main {

	public static void main(String[] args) {
		Tree myAvl = new AVL();
		
		myAvl.insert(10);
		myAvl.insert(20);
		myAvl.insert(30);
		myAvl.insert(40);
		myAvl.insert(50);
		myAvl.insert(60);
//		myAvl.insert(8);
//		myAvl.insert(7);
//		myAvl.insert(20);
//		myAvl.insert(50);
//		
		myAvl.traverse();
		
	}
}
