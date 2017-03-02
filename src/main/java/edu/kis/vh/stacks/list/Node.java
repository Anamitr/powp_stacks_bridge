package edu.kis.vh.stacks.list;

public class Node {

	private int value;
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
