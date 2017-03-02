package edu.kis.vh.stacks;

public class Stack {

	private static final int INIT_TOTAL = -1;
	private static final int NUM_OF_ITEMS = 12;

	private int[] items = new int[NUM_OF_ITEMS];
	private int total = INIT_TOTAL;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return items[total--];
	}

}
