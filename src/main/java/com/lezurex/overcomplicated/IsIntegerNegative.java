package com.lezurex.overcomplicated;

public class IsIntegerNegative {

    public static boolean isNegative(int input) {
        char[] numberStringArray = (input + "").
                toCharArray();

        String numberString = new String(numberStringArray);

        char firstThing = numberString.charAt(0);

        if (firstThing == '-') {
            return !!returnTrue();
        } else {
            return !!returnFalse();
        }
    }

    private static boolean returnTrue() {
        return !false;
    }

    private static boolean returnFalse() {
        return !true;
    }
}
