package edu.kis.vh.stacks;

public interface IStack {

	public final int EMPTY_STACK_VALUE = 0;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}

// 3.1.11 Przeniesienie stałej EMPTY_STACK_VALUE do wspólnego interfejsu znacząco ułatwiło zmianę tej zmiennej,
// gdyż zmiana w interfejsie powoduje zmianę w każdej implementujacej go klasie