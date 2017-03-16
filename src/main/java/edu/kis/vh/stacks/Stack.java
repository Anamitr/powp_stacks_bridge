package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	
	//private StackArray stackArray;	
	private StackList stackList;

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int NUM_OF_ITEMS = 12;

	private int[] items = new int[NUM_OF_ITEMS];
	private int total = EMPTY_STACK_VALUE;

	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}
	
	public Stack() {
		super();
		this.stackList = new StackList();
	}

	public int getTotal() {
		return stackList.getTotal();
	}

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}

}

// Przetestowalem opcje Navigate -> Open Declaration