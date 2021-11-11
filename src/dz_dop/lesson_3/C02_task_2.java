package dz_dop;

import java.util.Scanner;

public class C02_task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значения b: ");
        int b = input.nextInt();
        System.out.println("Введите значения a: ");
        int a = input.nextInt();
        System.out.println("Введите значение c: ");
        int c = input.nextInt();
        double d = Math.pow (b , 2)  - 4 * a * c;
        System.out.println(" Дискриминант равен: " + d);

    }
}
