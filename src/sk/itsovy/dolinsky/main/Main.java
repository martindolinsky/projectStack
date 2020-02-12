package sk.itsovy.dolinsky.main;

import sk.itsovy.dolinsky.exception.QueueOverFlowException;
import sk.itsovy.dolinsky.exception.QueueUnderFlowException;
import sk.itsovy.dolinsky.exception.StackOverFlowException;
import sk.itsovy.dolinsky.exception.StackUnderFlowException;
import sk.itsovy.dolinsky.queue.Queue;
import sk.itsovy.dolinsky.stack.Stack;

public class Main {

    public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(3);
		Queue<Integer> queue = new Queue<>(3);

		try {
			System.out.print("STACK: ");
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.printStack();
			System.out.println("STACK CAPACITY: " + stack.getCapacity());
			System.out.println("STACK SIZE BEFORE POP: " + stack.getSize());
			stack.pop();
			System.out.println("STACK SIZE AFTER POP: " + stack.getSize());
			stack.printStack();
			System.out.println();

			System.out.print("QUEUE: ");
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.printQueue();
			System.out.println("QUEUE CAPACITY: " + queue.getCapacity());
			System.out.println("QUEUE SIZE BEFORE DEQUEUE: " + queue.getSize());
			queue.dequeue();
			System.out.println("QUEUE SIZE AFTER DEQUEUE: " + queue.getSize());

			queue.printQueue();

		} catch (StackOverFlowException | StackUnderFlowException | QueueOverFlowException | QueueUnderFlowException e) {
			e.printStackTrace();
		}
	}
}
