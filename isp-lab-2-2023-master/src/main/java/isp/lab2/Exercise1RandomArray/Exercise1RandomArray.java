package isp.lab2.Exercise1RandomArray;

import java.util.Random;


public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] findMinAndMax(int[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        int minim = array[0];
        int maxim = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < minim) {
                minim = array[i];
            }
            if (array[i] > maxim) {
                maxim = array[i];
            }

        }
        return new int[]{minim, maxim};
    }

    public static void main(String[] args) {

        Random random = new Random();

        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMinAndMax(a);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}
