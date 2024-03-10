package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        String[] splitInput = input.split(",");
        int size = splitInput.length;

        int j = 0;
        int minim = Integer.parseInt(splitInput[0]);
        int maxim = Integer.parseInt(splitInput[0]);
        int imax = 0;
        int imin = 0;

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(splitInput[i]);
            if (num % 2 == 0) {
                if (num > maxim) {
                    maxim = num;
                    imax = i;
                }
            }
            if (num % 2 == 1) {
                if (num < minim) {
                    minim = num;
                    imin = i;
                }
            }
        }

        return new int[]{maxim, imax, minim, imin};
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
