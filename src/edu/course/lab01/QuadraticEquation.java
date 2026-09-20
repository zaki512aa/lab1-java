package edu.course.lab01;

public final class QuadraticEquation {
    private QuadraticEquation() {
    }

    public static void solve(double a, double b, double c) {
        if (a == 0) {
            System.out.println("ошибка: коэффициент a не может быть равен нулю");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("два корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("один корень:");
            System.out.println("x = " + x);
        } else {
            System.out.println("вещественных корней нет");
        }
    }
}
