package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {
	
	public class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		protected int getValue() {
			return value;
		}

		protected Node getNext() {
			return next;
		}

		protected void setNext(Node next) {
			this.next = next;
		}

		protected Node getPrev() {
			return prev;
		}

		protected void setPrev(Node prev) {
			this.prev = prev;
		}
	}

	private Node last;
	private int total = IStack.EMPTY_STACK_VALUE;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return IStack.EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}
	
	public int getTotal() {
		return total;
	}

}
