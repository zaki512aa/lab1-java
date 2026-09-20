package edu.course.lab01;

public final class FizzBuzz {
    private FizzBuzz() {
    }

    public static void run() {
        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
