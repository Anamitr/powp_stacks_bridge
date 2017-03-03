package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		
		testStacks(factory);
		
	}

	private static void testStacks(DefaultStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(),
				factory.getFIFOStack(), factory.getHanoiStack()};
		
		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
			
			java.util.Random rn = new java.util.Random();
			for (int i = 1; i < 15; i++)
				stacks[3].push(rn.nextInt(20));
			
			for (int i = 0; i < stacks.length; i++) {
				while (!stacks[i].isEmpty())
					System.out.print(stacks[i].pop() + "  ");
					System.out.println();
			}
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
	}
	
}

// 1.
//Poprawione wiersze w klasie Stack:
//Wiersze: 11, 14-32
//Poprawione wiersze w klasie "StackFIFO":
//Wiersze: 10, 15
//Poprawione wiersze w klasie "StackHanoi":
//Wiersze: 5,10,12-15

// 2.
//Kombinacja klawiszy alt + <- powoduje przełączanie do ostatnio otwartego pliku w Eclipse
//alt + -> wraca z powrotem do ostatnio otwartego pliku

// 8.
//Zhermetyzowałem oba pola w klasie Node. Klasa StackList musi mieć do nich dostęp. Po enkapsulacji, miast odnosić się za pomocą ".",
//klasa StackList używa getterów i setterów