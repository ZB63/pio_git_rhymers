package edu.kis.vh.nursery;

/**
 *DefaultCountingOutRhymer
 */
public class DefaultCountingOutRhymer {

    private static final int DEFAULT_VALUE = -1;

	private static final int NUMBERS_SIZE = 12;
    
	private int[] numbers = new int[NUMBERS_SIZE];

    /**
     * Metoda getTotal().
     * @return Indeks ostatnio zapisanego elementu.
     */
    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_VALUE;

    /**
     * Metoda countIn, sluzy do wprowadzania nowego elementu do tablicy.
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Metoda callCheck(), sluzy do sprawdzania czy tablica jest pusta.
     * @return True, jezeli tablica jest pusta.
     */
    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    /**
     * Metoda isFull(), sprawdza czy tablica jest pelna.
     * @return True, jezeli tablica jest pelna.
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Metoda zwraca ostatnio dodany element.
     * @return Ostatnio dodany element, jezeli tablica jest pusta -1.
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Metoda zwraca ostatnio dodany element i usuwa go.
     * @return Ostatnio dodany element, jezeli tablica jest pusta -1.
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    //3. Nie ma juz zadnych nieprywatnych pol.
    //4. Nie ma zadnych nieuzywanych setterow.
}
