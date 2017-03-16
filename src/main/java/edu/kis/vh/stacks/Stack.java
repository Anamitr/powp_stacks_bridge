package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class Stack {
	
	//private StackArray stackArray;	
	private IStack stack;
	private IStack defaultStackImplementation = new StackList();

	public Stack(IStack stackImplementation) {
		super();
		this.stack = stackImplementation;
	}
	
	public Stack() {
		super();
		this.stack = defaultStackImplementation;
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}

}

// Przetestowalem opcje Navigate -> Open Declaration

// 3.1.7 Wysyłając do konstruktora klasę implementującą interfejs IStack możemy wybrać sposób implementacji Stosu

// 3.1.13 Navigate -> Open Declaration odnosi po prostu do interfejsu w ktorym metoda jest zadeklarowana, a Type Hierarchy
// otwiera listę klas implementujących ten interfejs + daje podgląd składników wylistowanych klas