package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int SIZE = 12;

	private int[] items = new int[SIZE];
	private int total = IStack.EMPTY_STACK_VALUE;

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
		return total == IStack.EMPTY_STACK_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == SIZE;
	}

	@Override
	public int top() {
		if (isEmpty())
			return IStack.EMPTY_STACK_VALUE;
		return items[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		return items[total--];
	}

}