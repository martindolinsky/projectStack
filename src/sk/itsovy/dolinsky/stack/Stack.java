package sk.itsovy.dolinsky.stack;

import sk.itsovy.dolinsky.exception.StackOverFlowException;
import sk.itsovy.dolinsky.exception.StackUnderFlowException;

import java.util.ArrayList;

/**
 * @author Martin Dolinsky
 */
public class Stack<T> {
	private int size;
	private int capacity;
	private ArrayList<T> list;

	public Stack(int capacity) {
		this.capacity = capacity;
		list = new ArrayList<>();
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public void push(T object) throws StackOverFlowException {
		if (object == null) return;
		if (!isFull()) {
			list.add(object);
			size++;
		}
		else throw new StackOverFlowException("Stack is full!");
	}

	public void pop() throws StackUnderFlowException {
		if (isEmpty()) throw new StackUnderFlowException("Stack is empty!");
		else {
			size--;
			list.remove(size -1);
		}
	}

	public T top() {
		if (isEmpty()) return null;
		else {
			return list.get(size-1);
		}
	}

	public T topAndPop() throws StackUnderFlowException {
		T temp = top();
		pop();
		return temp;
	}

	public void empty() {
		list.clear();
	}

	public void printStack() {
		System.out.print("[");
		for (T t:list) {
			System.out.print(" " + t + ",");

		}
		System.out.print(" ]");
	}
}
