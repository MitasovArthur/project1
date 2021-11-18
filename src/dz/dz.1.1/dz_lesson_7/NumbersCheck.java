package dz.dz_lesson_7;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число положительное или отрицательное");
        int number1 = sc.nextInt();
        System.out.println(add_or_sub(number1));

        System.out.println("Число простое");
        int number2 = sc.nextInt();
        System.out.println(Prime_number(number2));
    }

    //Метот к заданию 1
    public static String add_or_sub(int number) {
        if (number >= 0) {
            return "Число положительное";

        }
        return "число отрицательное";
    }

    //Метод к заданию 2
    public static String Prime_number(int number) {
        int result1 = number % 2;
        if (result1 == 0) {
            return "Число не являеться простое";
        }
        return "Число простое";
    }

    //Метод к заданию 3
    public static String hunky (int number){
        if(number/2==0&&number/5==0&&number/3==0&&number/6==0&&number/9==0){
            System.out.println("Число делиться без остатка на 2, 5, 3, 6, 9 ");
        }
        return "";
    }
}




