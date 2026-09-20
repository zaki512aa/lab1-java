package edu.course.lab01;

public final class SeriesCalculator {
    private SeriesCalculator() {
    }

    public static void calculate() {
        double sum = 0.0;
        int n = 2;
        int count = 0;
        int lastN = 2;
        final double epsilon = 1e-6;

        while (true) {
            double term = 1.0 / (n * n + n - 2);

            if (Math.abs(term) < epsilon) {
                break;
            }

            sum += term;
            lastN = n;
            count++;
            n++;
        }

        System.out.println("сумма ряда: " + sum);
        System.out.println("последний добавленный номер n: " + lastN);
        System.out.println("количество добавленных членов: " + count);
    }
}
