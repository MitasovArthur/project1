package dz_dop.lesson_4;

import java.util.Scanner;

public class С02_task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя : ");
        String name = input.next();
        System.out.println("Введите ваш возраст : ");
        int age = input.nextInt();
        System.out.println("Введите ваш пол : ");
        String sex = input.next();
        if (age >= 18) {
            System.out.println(String.format("Поьзователь %s вам %s лет и ваш пол %s", name, age, sex));
            System.out.println("Доступ разрешен");
        } else
            System.out.println("Вам не достаточно лет");
    }
}
