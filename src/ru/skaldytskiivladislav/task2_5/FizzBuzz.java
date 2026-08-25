package ru.skaldytskiivladislav.task2_5;

public class FizzBuzz {
    public static void fizzBuzz(int numberToCheck) {
        if (numberToCheck % 15 == 0) {
            System.out.print("FizzBuzz");
        } else if (numberToCheck % 3 == 0) {
            System.out.print("Fizz");
        } else if (numberToCheck % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(numberToCheck);
        }
        if (numberToCheck < 100) {
            System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            fizzBuzz(i);
        }
    }
}
