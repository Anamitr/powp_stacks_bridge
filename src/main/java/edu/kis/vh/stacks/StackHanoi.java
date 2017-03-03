package edu.kis.vh.stacks;

/**
 * Klasa rozszerzajca klase Stack, na ktorym nie mozna polozyc liczby wiekszej niz obecna na wierzchu stosu
 * @author Konrad Sochacki
 * @version 3.3.2
 * @see Stack
 * 
 */
public class StackHanoi extends Stack {
	/**
	 * Pole reprezentujace ilosc odrzuconych elementow
	 */
	private int totalRejected = 0;
	/**
	 * Funkcja zwracajaca pole totalRejected, w zasadzie getter
	 * @return totalRejected
	 */
	public int reportRejected() {
		return totalRejected;
	}
	/**
	 * Nadpisana funkcja, wkladajaca element na stos o ile jest to mozliwe
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}