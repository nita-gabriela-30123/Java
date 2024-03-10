package isp.lab2.Exercise6WordGuess;

import java.util.Scanner;

public class Exercise6WordGuess {


    public static int[] getOccurrencePositions(char c, char[] word) {
        int size = word.length;
        char[] b = new char[size];
        int positions = 0;
        int count = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (word[i] == c) {
                b[j] = word[i];
                j++;
            }
        }
        if (count == 0) {
            return null;
        }

        int[] result = new int[count];
        for (int i = 0; i < j; i++) {
            result[i] = b[i];

        }
        return result;

    }

    public static void main(String[] args) {
        char[] word = "book".toCharArray(); // replace with a word from a dictionary
        boolean solved = false;
        Scanner scanner = new Scanner(System.in);
        char[] guessedLetters = new char[word.length];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '*';
        }
        int tries = 0;
        while (tries < 10 && !solved) {
            tries++;
            System.out.println("Enter a letter: ");
            String letter = scanner.nextLine();
            int[] occurrences = getOccurrencePositions(letter.charAt(0), word);
            if (occurrences != null) {
                for (int positions = 0; positions < word.length; positions++) {

                }
            }

        }
    }

}
