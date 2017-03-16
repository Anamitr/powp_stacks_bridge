package edu.kis.vh.stacks;

public class Stack {
	
	private StackArray stackArray;	

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int NUM_OF_ITEMS = 12;

	private int[] items = new int[NUM_OF_ITEMS];
	private int total = EMPTY_STACK_VALUE;

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public Stack() {
		super();
		this.stackArray = new StackArray();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

}
