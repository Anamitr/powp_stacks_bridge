package edu.kis.vh.stacks;

public interface IStack {

	public int EMPTY_STACK_VALUE = -1;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}