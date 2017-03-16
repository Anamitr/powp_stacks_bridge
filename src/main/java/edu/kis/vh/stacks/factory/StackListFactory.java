package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

public class StackListFactory implements IstacksFactory {
	public Stack getStandardStack(){
		return new Stack(new StackList());
	}

	public Stack getFalseStack() {
		return new Stack(new StackArray());
	}

	public StackFIFO getFIFOStack() {
		return new StackFIFO(new StackList());
	};

	public StackHanoi getHanoiStack(){
		return new StackHanoi(new StackList());
	}

}
