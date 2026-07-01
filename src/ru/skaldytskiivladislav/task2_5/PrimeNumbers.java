package ru.skaldytskiivladislav.task2_5;

public class PrimeNumbers {

    public static void main(String[] args) {

        int count = 0;

        for (int n = 2; n <= 100; n++) {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {

                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {

                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("Всего простых чисел: %d%n", count);
    }
}
