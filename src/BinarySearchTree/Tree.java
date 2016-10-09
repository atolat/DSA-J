package BinarySearchTree;

//Interface to define all methods that must be implemented by BST/any tree in general
public interface Tree<T> {

	public void traverse();

	public void insert(T data, Node<T> recurseNode);

	public void delete(T data);

	public T getMax();

	public T getMin();

}
