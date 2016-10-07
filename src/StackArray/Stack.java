package StackArray;

public class Stack<T> {

	private T[] stack;
	private int size=0;

	//Constructor
	public Stack() {
		//Create an array of size 1
		this.stack = (T[]) new Object[1];
	}

	public void push(T data) {
		size++;
		//Check size, if full, resize
		if(this.stack.length == size){
			resize(2*this.stack.length);
		} 

		this.stack[size] = data;
	}

	public T pop() {
		if(size == 0){
			System.out.println("Nothing to pop!");
			return null;
		} else {
			T poppedData = this.stack[size];
			size--;
//			if(size == this.stack.length/4){
//				resize(this.stack.length/2);
//			}
			return poppedData;
		}
	}

	//Method to resize arrays
	public void resize(int capacity) {
		T[] resizedArray = (T[]) new Object[capacity];
		for(int i = 0; i<this.stack.length;i++){
			resizedArray[i] = this.stack[i];
		}
		this.stack = resizedArray;
	}

}
