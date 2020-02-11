package sk.itsovy.dolinsky.main;

import sk.itsovy.dolinsky.exception.StackOverFlowException;
import sk.itsovy.dolinsky.exception.StackUnderFlowException;
import sk.itsovy.dolinsky.stack.Stack;

public class Main {

    public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(3);

		try {
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.pop();
			System.out.println(stack.getSize());
			System.out.println(stack.getCapacity());
			stack.printStack();
		} catch (StackOverFlowException | StackUnderFlowException e) {
			e.printStackTrace();
		}
	}
}
