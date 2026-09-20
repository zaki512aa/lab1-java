package edu.course.lab01;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];

        switch (command) {
            case "fizzbuzz":
                if (args.length != 1) {
                    System.out.println("ошибка: команда fizzbuzz не принимает дополнительных аргументов");
                    printUsage();
                    return;
                }
                FizzBuzz.run();
                break;

            case "reverse":
                if (args.length != 2) {
                    System.out.println("ошибка: команда reverse требует один аргумент (строку)");
                    printUsage();
                    return;
                }
                String reversed = TextTasks.reverse(args[1]);
                System.out.println(reversed);
                break;

            case "quadratic":
                if (args.length != 4) {
                    System.out.println("ошибка: команда quadratic требует три аргумента (a, b, c)");
                    printUsage();
                    return;
                }
                try {
                    double a = Double.parseDouble(args[1]);
                    double b = Double.parseDouble(args[2]);
                    double c = Double.parseDouble(args[3]);
                    QuadraticEquation.solve(a, b, c);
                } catch (NumberFormatException e) {
                    System.out.println("ошибка: все коэффициенты должны быть числами");
                    printUsage();
                }
                break;

            case "series":
                if (args.length != 1) {
                    System.out.println("ошибка: команда series не принимает дополнительных аргументов");
                    printUsage();
                    return;
                }
                SeriesCalculator.calculate();
                break;

            case "palindrome":
                if (args.length != 2) {
                    System.out.println("ошибка: команда palindrome требует один аргумент (строку)");
                    printUsage();
                    return;
                }
                boolean isPalindrome = TextTasks.isPalindrome(args[1]);
                System.out.println(isPalindrome);
                break;

            default:
                System.out.println("ошибка: неизвестная команда '" + command + "'");
                printUsage();
        }
    }

    private static void printUsage() {
        System.out.println("использование:");
        System.out.println("  java edu.course.lab01.Main fizzbuzz");
        System.out.println("  java edu.course.lab01.Main reverse <строка>");
        System.out.println("  java edu.course.lab01.Main quadratic <a> <b> <c>");
        System.out.println("  java edu.course.lab01.Main series");
        System.out.println("  java edu.course.lab01.Main palindrome <строка>");
    }
}
