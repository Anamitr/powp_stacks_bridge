package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int EMPTY_STACK_VALUE = -1;
	private static final int NUM_OF_ITEMS = 12;

	private int[] items = new int[NUM_OF_ITEMS];
	private int total = EMPTY_STACK_VALUE;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == -1;
	}

	@Override
	public boolean isFull() {
		return total == 11;
	}

	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		return items[total--];
	}

}