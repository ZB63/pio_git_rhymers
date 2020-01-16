package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_VALUE = -1;

	private static final int NUMBERS_SIZE = 12;
    
	private int[] numbers = new int[NUMBERS_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    //3. Nie ma juz zadnych nieprywatnych pol.
    //4. Nie ma zadnych nieuzywanych setterow.
}
