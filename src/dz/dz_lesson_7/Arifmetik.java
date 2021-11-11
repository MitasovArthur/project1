package dz.dz_lesson_7;

import java.util.Scanner;

public class Arifmetik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        String znak = sc.next();
        if (znak == "+") {
            System.out.println(add(number1, number2));
        }
        else if (znak == "-") {
            System.out.println(sub(number1, number2));
        }
        else if (znak == "*") {
            System.out.println(mul(number1, number2));
        }
        else if (znak == "/") {
            System.out.println(del(number1, number2));
        }
    }


    public static int add(int number1, int number2) {
        return number1 + number2;

    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    public static int del(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("error");
        }
        return number1 / number2;
    }

}
