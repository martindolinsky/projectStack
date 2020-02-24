package sk.itsovy.dolinsky.main;

import sk.itsovy.dolinsky.exception.QueueOverFlowException;
import sk.itsovy.dolinsky.exception.QueueUnderFlowException;
import sk.itsovy.dolinsky.exception.StackOverFlowException;
import sk.itsovy.dolinsky.exception.StackUnderFlowException;
import sk.itsovy.dolinsky.linkedlist.MyLinkedList;
import sk.itsovy.dolinsky.linkedlist.Node;
import sk.itsovy.dolinsky.queue.Queue;
import sk.itsovy.dolinsky.stack.Stack;

public class Main {

    public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(3);
		Queue<Integer> queue = new Queue<>(3);

		MyLinkedList myLinkedList = new MyLinkedList();
		Node<String> n1 = new Node<>("Filip");
		Node<String> n2 = new Node<>("Eva");
		Node<String> n3 = new Node<>("Jaro");
		Node<String> n4 = new Node<>("Jakub");
		Node<String> n5 = new Node<>("Miro");
		Node<String> n6 = new Node<>("Bartolomej");
		Node<String> n7 = new Node<>("Robert");
		myLinkedList.addToFront(n1);
		myLinkedList.addToFront(n2);
		myLinkedList.addToFront(n3);
		myLinkedList.addToEnd(n4);
		myLinkedList.addToEnd(n5);
		myLinkedList.addTo(n6, 1);
		System.out.println(myLinkedList.findByName("Miro").getData());
		System.out.println(myLinkedList.remove(null));
		myLinkedList.remove(myLinkedList.findByName("Jakub"));
		myLinkedList.print();
		System.out.println("\n" + myLinkedList.getSize());

		try {
			System.out.println("\n");
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
