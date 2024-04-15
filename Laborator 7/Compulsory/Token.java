package org.example;

/**
 * Represents a token with two numbers.
 */
public class Token {
    private final int firstNumber;
    private final int secondNumber;

    /**
     * Constructs a new Token with the given numbers.
     *
     * @param firstNumber  The first number of the token.
     * @param secondNumber The second number of the token.
     */
    public Token(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * Retrieves the first number of the token.
     *
     * @return The first number of the token.
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * Retrieves the second number of the token.
     *
     * @return The second number of the token.
     */
    public int getSecondNumber() {
        return secondNumber;
    }

    /**
     * Returns a string representation of the token.
     *
     * @return A string representation of the token in the format "(firstNumber, secondNumber)".
     */
    @Override
    public String toString() {
        return "(" + firstNumber + ", " + secondNumber + ")";
    }
}
