package ru.skaldytskiivladislav.task2_5;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static class PrimeResult {
        List<Integer> primes;
        int count;

        public PrimeResult(List<Integer> primes, int count) {
            this.primes = primes;
            this.count = count;
        }
    }

    public static PrimeResult findPrimeNumbers(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int n = 2; n <= limit; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(n);
            }
        }
        return new PrimeResult(primes, primes.size());
    }

    public static void printInfo(PrimeResult primeResult) {
        for (int prime : primeResult.primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
        System.out.printf("Всего простых чисел: %d%n", primeResult.count);
    }

    public static void main(String[] args) {
        PrimeResult result = findPrimeNumbers(100);
        printInfo(result);
    }
}
