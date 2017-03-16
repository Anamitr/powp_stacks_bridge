package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementations.StackArray;

public class StackArrayFactory implements IstacksFactory {
	public Stack getStandardStack(){
		return new Stack(new StackArray());
	}

	public Stack getFalseStack() {
		return new Stack(new StackArray());
	}

	public StackFIFO getFIFOStack() {
		return new StackFIFO(new StackArray());
	};

	public StackHanoi getHanoiStack(){
		return new StackHanoi(new StackArray());
	}

}
