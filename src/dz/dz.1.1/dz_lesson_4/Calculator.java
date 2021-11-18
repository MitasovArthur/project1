package dz.dz_lesson_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значения operator1: ");
        int operator1 = input.nextInt();
        System.out.println("Введите арифметический знак: ");
        String sign = input.next();
        System.out.println("Введите значения operator2: ");
        int operator2 = input.nextInt();
        int result = 0;
        switch (sign) {
            case "/":
                result = operator1 / operator2;
                System.out.println(result);
                break;
            case "*":
                result = operator1 * operator2;
                System.out.println(result);
                break;
            case "-":
                result = operator1 - operator2;
                System.out.println(result);
                break;
            case "+":
                result = operator1 + operator2;
                System.out.println(result);
                break;
            case "%":
                result = operator1 % operator2;
                System.out.println(result);
                break;

        }

    }
}
