package edu.course.lab01;

public final class TextTasks {
    private TextTasks() {
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(input.length() - 1 - i);
        }
        return new String(chars);
    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // Пропускаем символы слева, которые не являются буквами или цифрами
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            // Пропускаем символы справа, которые не являются буквами или цифрами
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            // Сравниваем символы без учёта регистра
            if (Character.toLowerCase(input.charAt(left)) !=
                Character.toLowerCase(input.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
