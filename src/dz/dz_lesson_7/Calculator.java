package dz.dz_lesson_7;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculator(1, 2, 3));

    }

    public static int calculator(int number1, int number2, int number3) {
        int result = (number1 + number2 + number3) / 3;
        return result;
    }
}

