package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {

    public static String[] searchSubstrings(String input, String substring) {
        String[] splitInput = input.split(",");
        int size = splitInput.length;
        String[] c = new String[size];
        int j = 0;

        for (int i = 0; i < size; i++) {
            if (splitInput[i].contains(substring)) {
                c[j] = splitInput[i];
                j++;
            }
        }

        String[] result = new String[j];
        for (int i = 0; i < j; i++) {
            result[i] = c[i];
        }
        return result;

    }

    public static String readFromConsole(String suffix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + suffix);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car"; // = readFromConsole("words");
        String substring = "te"; // = readFromConsole("substring");
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
