package com.amazon.ata.interfaces;

/**
 * Reverse a String and act like a <code>CharSequence</code>.
 * <p>
 * Change this class definition to implement CharSequence.
 */
public class ReversedString implements CharSequence {
    private final String reverseChars;
    /**
     * Implement this constructor during the interfaces prework.
     *
     * @param chars The String of chars to be reversed
     */
    public ReversedString(final String chars) {
        reverseChars = chars;
    }

    @Override
    public int length() {
        return reverseChars.length();
    }

    @Override
    public char charAt(int index) {
        return reverseChars.charAt(length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String sequence = "";

        for(int i = length() - 1 - start; i >= length() - end; i--){
            sequence += reverseChars.charAt(i);
        }

        return sequence;
    }

    @Override
    public String toString(){
        return String.valueOf(subSequence(0, length()));
    }

}
