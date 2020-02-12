package sk.itsovy.dolinsky.queue;

import sk.itsovy.dolinsky.exception.QueueOverFlowException;
import sk.itsovy.dolinsky.exception.QueueUnderFlowException;

import java.util.ArrayList;

/**
 * @author Martin Dolinsky
 */
public class Queue<T> {
	private int size;
	private int capacity;
	private ArrayList<T> list;

	public Queue(int capacity) {
		if (this.capacity < 1) {
			this.capacity = 5;
		}
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

	public void enqueue(T object) throws QueueOverFlowException {
		if (object == null) return;
		if (!isFull()) {
			list.add(object);
			size++;
		} else throw new QueueOverFlowException("Queue is full!");
	}

	public void dequeue() throws QueueUnderFlowException {
		if (isEmpty()) throw new QueueUnderFlowException("Queue is empty!");
		else {
			size--;
			list.remove(0);
		}
	}

	public T front() {
		if (isEmpty()) return null;
		else {
			return list.get(0);
		}
	}

	public T frontAndDeque() throws QueueUnderFlowException {
		T temp = front();
		dequeue();
		return temp;
	}

	public void empty() {
		list.clear();
		size = 0;
	}

	public void printQueue() {
		for (T t : list) {
			System.out.print(t + ", ");
		}
		System.out.println();
	}

}
