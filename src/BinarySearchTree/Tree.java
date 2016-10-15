package BinarySearchTree;

//Interface to define all methods that must be implemented by BST/any tree in general
public interface Tree<T> {

	public void traverse();

	public void delete(T data);

	public T getMaxVal();

	public T getMinVal();

	public void insert(T i);
	
	public T getRoot();

}
