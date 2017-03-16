package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends Stack {

	private Stack temp = new Stack(new StackList());

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStack stackImplementation) {
		super(stackImplementation);
		// TODO Auto-generated constructor stub
	}
}

// 3.1.14 Lepszy jest StackList, ponieważ w StackArray po wyjeciu pierwszego elementu wszystkie pozostale trzeba przesunac
// do przodu, a w StackList jedynie zmienic 2 referencje