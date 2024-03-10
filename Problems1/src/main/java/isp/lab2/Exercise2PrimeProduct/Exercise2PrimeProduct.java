package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {


    public static long getPrimeProduct(int n, int m) {
        int P = 1;
        for (int i = n; i <= m; i++) {
            boolean isPrim = true;
            for (int div = 2; div <= Math.sqrt(i); div++) {
                if (i % div == 0) {
                    isPrim = false;
                    break;
                }
            }
            if (isPrim && i > 1) {
                P = P * i;
            }
        }

        return P;
    }


    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
